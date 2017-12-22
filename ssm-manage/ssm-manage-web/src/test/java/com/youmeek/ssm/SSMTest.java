package com.youmeek.ssm;

import com.wml.ssm.manage.pojo.SysUser;
import com.wml.ssm.manage.service.SysUserService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
@Ignore
public class SSMTest {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Resource
	private SysUserService sysUserService;

	@Test
	public void test1() {
		SysUser sysUser = sysUserService.getById(1L);
		logger.info("--------------------------------" + sysUser.toString());
		System.out.println("hello world. ");
	}
	@Test
	public void testStr() {
		String  s = null;
		s = s + "!";
		System.out.println(s);
	}

	public static void main(String args[]){
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://wap.tjcyfdc.com/");
		//HttpGet httpGet = new HttpGet("http://www.yongtuocn.com/");
		httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
		CloseableHttpResponse response = null;
		try {
			int i = 0;
			while(true){
				response = httpClient.execute(httpGet);
				System.out.println(i++);
				response.close();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
