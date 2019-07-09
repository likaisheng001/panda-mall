package com.panda.product.core.test.base;


import com.panda.mall.common.dto.SkuChangePushRetailDto;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;

public class JSONUtilTest {
	@Test
	public void test001(){
//		String json ="{\"date\":1499443200000}";
//		MyDate date = JSONUtil.toObject(json, MyDate.class);
//		System.out.println(date);
//		String json2 = JSONUtil.toJSON(date);
//		System.out.println(json2);
//		MyDate object = JSONUtil.toObject(json2, MyDate.class);
//		System.out.println(object);
	}
	@Test
	public void json(){
		String json = "[{\"skuId\":1014874,\"wareId\":36},{\"skuId\":1014307,\"wareId\":36},{\"skuId\":1015002,\"wareId\":36}]";
		JSONArray fromObject = JSONArray.fromObject(json);
		for(int i = 0; i<fromObject.size(); i++){
			JSONObject jsonObject = fromObject.getJSONObject(i);
			Object bean = JSONObject.toBean(jsonObject, SkuChangePushRetailDto.class);
			System.out.println(bean);
		}
	}
}
