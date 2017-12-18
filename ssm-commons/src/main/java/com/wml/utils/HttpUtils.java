package com.wml.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpUtils extends HttpclientBaseConfig{
  private static final Logger log = LoggerFactory.getLogger(HttpUtils.class);

  public static JSONObject doPost(String url, String jsonFormString) throws Exception {
    HttpClient client = HttpClients.createDefault();
    HttpPost post = new HttpPost(url);
    post.addHeader("text/plain", "UTF-8");
    post.addHeader("Content-Type", "application/json");
    RequestConfig requestConfig = RequestConfig.custom()
                                  .setConnectTimeout(5000)
                                  .setConnectionRequestTimeout(5000)
                                  .setSocketTimeout(5000).build();
    post.setConfig(requestConfig);
    log.info("POST请求内容：{}", jsonFormString);

    StringEntity s = new StringEntity(jsonFormString, "UTF-8");
    post.setEntity(s);
    HttpResponse httpResponse = client.execute(post);

    JSONObject response = null;
    if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
      String result = EntityUtils.toString(httpResponse.getEntity());// 返回json格式：
      response = JSONObject.parseObject(result);
    } else {
      String errorMsg = EntityUtils.toString(httpResponse.getEntity());
      throw new RuntimeException(errorMsg);
    }
    return response;
  }

  public static String doGet(String url) throws Exception {
    HttpClient client = HttpClients.createDefault();
    HttpGet get = new HttpGet(url);
    get.setHeader("Content-Type", "application/json; charset=UTF-8");

    String response = null;
    HttpResponse httpResponse = client.execute(get);
    if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
      response = EntityUtils.toString(httpResponse.getEntity());// 返回json格式：
    } else {
      String errorMsg = EntityUtils.toString(httpResponse.getEntity());
      throw new RuntimeException(errorMsg);
    }

    return response;
  }
}
