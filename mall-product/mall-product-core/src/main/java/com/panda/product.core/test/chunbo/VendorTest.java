package com.panda.product.core.test.chunbo;

import com.panda.mall.common.client.HttpClientUtil;
import com.panda.mall.common.client.HttpResponse;
import com.panda.mall.common.util.EncryptUtil;
import com.panda.mall.common.util.HttpUtil;
import com.panda.mall.common.util.JSONUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class VendorTest {
//	172.16.3.22
//	private String url = "http://vendorapi.uat.chunbo.com:8172/gateway.html";
	private String url = "http://vendorapi.uat.chunbo.com:8172/gateway.html";
	private String partner = "1299999999";
	private String service = "vendor.purchasing.term.id.add";
	private String key = "d41d8cd98f00b204e9800998ecf8427e";
	private String _input_charset = "utf-8";
	private String sign_type = "MD5";
	private String return_type  = "json";
	
	@Test
	public void test001(){
		try {
			SortedMap<String, String> map = new TreeMap<String,String>();
			
			map.put("partner", partner);
			map.put("service", service);
			map.put("_input_charset", _input_charset);
			map.put("return_type", return_type);
			map.put("request_param","[{\"vendor_id\":\"9002064\",\"purchasing_term_id\":1}]");
			map.put("sign_type", sign_type);
			map.put("key", key);
			map.put("sign", EncryptUtil.createSign(key, map, _input_charset));
			
			System.out.println("sign:"+EncryptUtil.createSign(key, map, _input_charset));
			
			HttpClientUtil client = HttpClientUtil.getInstance();
			System.out.println("给结算初始化数据，url：" + url + ",参数,map ：" + JSONUtil.toJSON(map) );
			String resultStr = client.doGetForString(url, map);
			
			System.out.println(resultStr);
			
		} catch (Exception e) {
			throw new RuntimeException("推送结算错误");
		}
	}
	
	@Test
	public void test002(){
		
		String param = "{\"storeCode\":\"001\",\"customerStoreCode\":\"001\",\"batchSize\":\"1\",\"batchNo\":\"001\",\"items\":[{\"sku\":698150,\"customerStoreCode\":\"001\",\"itemName\":\"西湖龙井茶100g×2罐\",\"price1\":290.00}]}";
		HttpUtil httpUtil = new HttpUtil();
		HttpResponse postJson = httpUtil.postJson("http://10.254.128.145:8080/shopweb/integration", param);
		System.out.println(JSONUtil.toJSON(postJson));
		
	}
	@Test
	public void test003(){
		try {
			String param = ""; // 此处暂时省略
			HttpUtil httpUtil = new HttpUtil();
			Map<String, String> map = new HashMap<String, String>();
			map.put("skus", param);
			HttpClientUtil httpClientUtil = HttpClientUtil.getInstance();
			String result = httpClientUtil.doPostRetString("http://catalog.chunbo.com/PromotionActivity/ImportPromotion", null, map);
			System.out.println("result:"+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} 
