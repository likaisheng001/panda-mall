package com.panda.product.core.test.base;

import com.panda.mall.common.util.JSONUtil;
import com.panda.mall.common.client.HttpClientUtil;
import com.panda.mall.common.util.EncryptUtil;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.SortedMap;
import java.util.TreeMap;


public class CommonTest {
	
	@Test
	public void test01(){
		long parseLong = Long.parseLong("66659");
		System.err.println(parseLong);
	}
	
	@Test
	public void test02(){
		try{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
			String format = simpleDateFormat.format("");
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testSign(){
		try {
//			String partner = "1299999999";
//			String service = "";
			String _input_charset = "utf-8";
			String return_type = "json";
			String sign_type = "MD5";
			String key = "d41d8cd98f00b204e9800998ecf8427e";
			String url = "http://localhost:8080/purchase-product-server/rest/skuMain/goods";
			
			SortedMap<String, String> map = new TreeMap<String,String>();
//			map.put("partner", partner);
//			map.put("service", service);
			map.put("storeId", "1");
			map.put("invoiceId", "222");
			map.put("posId", "444");
			map.put("regionId", "222");
//			map.put("_input_charset", _input_charset);
//			map.put("return_type", return_type);
//			map.put("request_param", "{\"code\":698147}");
			map.put("code", "698147");
//			map.put("sign_type", sign_type);
			map.put("key", key);
			map.put("sign", EncryptUtil.createSign(key, map, _input_charset));
			JSONUtil.toJSON(map);
			HttpClientUtil instance = HttpClientUtil.getInstance();
//			String result = instance.doPostRetString(url, null, map);
			
			String doPostForString = instance.doPostForString(url, map);
			System.out.println("result: " + doPostForString);
			
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void testSign01(){
		try {
			String _input_charset = "utf-8";
			String return_type = "json";
			String sign_type = "MD5";
			String key = "d41d8cd98f00b204e9800998ecf8427e";
			String url = "http://localhost:8080/purchase-product-server/rest/skuMain/goods";
			
			SortedMap<String, String> map = new TreeMap<String,String>();
			map.put("packageNum", "packageNum");
			map.put("number", "number");
			map.put("productStatus", "productStatus");
			map.put("productType", "productType");
			map.put("upc", "upc");
			map.put("unit", "unit");
			map.put("salePrice", "salePrice");
			map.put("productName", "productName");
			map.put("brandId", "brandId");
			map.put("cateId", "cateId");
			map.put("specId", "specId");
			map.put("cateId", "cateId");
			map.put("isWeight", "isWeight");
			
			map.put("sign", EncryptUtil.createSign(key, map, _input_charset));
			
			System.out.println(JSONUtil.toJSON(map));
			
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void testSign02(){
		try {
			String _input_charset = "utf-8";
			String return_type = "json";
			String sign_type = "MD5";
			String key = "d41d8cd98f00b204e9800998ecf8427e";
			String url = "http://localhost:8080/purchase-product-server/rest/skuMain/goods";
			
			SortedMap<String, String> map = new TreeMap<String,String>();
			map.put("packageNum", "packageNum");
			map.put("number", "number");
			map.put("productStatus", "productStatus");
			map.put("productType", "productType");
			map.put("upc", "upc");
			map.put("unit", "unit");
			map.put("salePrice", "salePrice");
			map.put("productName", "productName");
			map.put("brandId", "brandId");
			map.put("cateId", "cateId");
			map.put("specId", "specId");
			map.put("cateId", "cateId");
			map.put("isWeight", "isWeight");
			
			map.put("sign", EncryptUtil.createSign(key, map, _input_charset));
			
			System.out.println(JSONUtil.toJSON(map));
			
		} catch (Exception e) {
			
		}
	}
	
}
