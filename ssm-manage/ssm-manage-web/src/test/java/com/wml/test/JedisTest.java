package com.wml.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Decription:
 * Created by WangMinli on 2017/12/25.
 */
public class JedisTest {
    private String ip = "23.83.247.149";
    private int port = 6379;
    /**
     * 连接redis数据库
     */
    @Test
    public void testJedis(){
        Jedis jedis = new Jedis(ip, 6379);
        jedis.set("name", "zhangsan");
        String name = jedis.get("name");
        System.out.println(name);
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
            jedis.set("name", "lisi");
            System.out.println(jedis.get("name"));
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
}
