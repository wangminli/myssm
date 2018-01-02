package com.wml.test;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Decription:
 * Created by WangMinli on 2017/12/25.
 */
public class JedisTest {
    private String ip = "23.83.247.149";
    private int port = 6379;
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(JedisTest.class);
    /**
     * 连接redis数据库
     */
    @Test
    public void testJedis(){
        Jedis jedis = new Jedis(ip, 6379);
        jedis.set("name", "zhangsan");
        System.out.println(jedis.get("name"));
        jedis.close();
    }
    /**
     * 使用连接池方式连接redis
     */
    @Test
    public void testJedisPool(){
        // 获得连接池的配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        // 设置最大连接数
        config.setMaxTotal(30);
        // 设置最大空闲连接数
        config.setMaxIdle(10);
        // 获得连接池
        JedisPool jedisPool = new JedisPool(config, ip, port);
        // 初始化 redis
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            // 测试String
            jedis.set("name", "lisi");
            System.out.println(jedis.get("name"));

            // 测试hash
            jedis.hset("myhash", "name", "jefferson");
            jedis.hset("myhash", "age", "25");
            System.out.println(jedis.hget("myhash", "age"));

            // 测试list
            jedis.rpush("mylist", "1");
            jedis.rpush("mylist", "2");
            jedis.rpush("mylist", "3");
            System.out.println(jedis.lrange("mylist", 0, -1));  // [1, 2, 3]

            // 测试set
            jedis.sadd("myset", "a");
            jedis.sadd("myset", "b");
            jedis.sadd("myset", "a");
            System.out.println(jedis.smembers("myset")); // [b, a]

            // 测试zset
            jedis.zadd("myzset", 2, "wangminli");
            jedis.zadd("myzset", 7, "lisi");
            jedis.zadd("myzset", 11, "wangwu");
            System.out.println(jedis.zscore("myzset", "lisi"));
            System.out.println(jedis.zrange("myzset", 0, -1));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
            if(jedisPool != null){
                jedisPool.close();
            }
        }
    }

    /**
     * 使用sentinel测试jedis连接
     */
    @Test
    public void testJedisSentinelPool(){
        Set<String> sentinels = new HashSet<String>();
        sentinels.add("23.83.247.149:26379");
        sentinels.add("23.83.247.149:26380");
        sentinels.add("23.83.247.149:26381");
        JedisSentinelPool sentinelPool = new JedisSentinelPool("mymaster", sentinels);
        Jedis jedis = null;
        try {
            jedis = sentinelPool.getResource();
            int index = new Random().nextInt(10000);
            String key = "k-" + index;
            String value = "v-" + index;
            jedis.set(key, value);
            logger.info("{} value is {}", key, jedis.get(key));
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }
}
