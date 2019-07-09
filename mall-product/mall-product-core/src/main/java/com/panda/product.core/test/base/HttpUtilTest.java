package com.panda.product.core.test.base;

import com.panda.mall.common.util.JSONUtil;
import com.panda.product.core.model.StockReceipt;
import com.panda.mall.common.client.HttpClientUtil;
import com.panda.mall.common.client.HttpResponse;
import com.panda.mall.common.client.HttpUtil;
import com.panda.product.core.model.StockResult;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class HttpUtilTest {
	private String url = "http://stock-ws.uat.chunbo.com/services/receiveStockReceipt/receiveStockReceipt";
	
	@Test
	public void utilTest(){
		HttpUtil httpUtil = new HttpUtil();
		String param = "{\"storeCode\":\"001\",\"customerStoreCode\":\"001\",\"batchSize\":\"1\",\"batchNo\":\"001\",\"items\":[{\"sku\":698150,\"customerStoreCode\":\"001\",\"itemName\":\"西湖龙井茶100g×2罐\",\"price1\":290.00}]}";
		HttpResponse postJson = httpUtil.postJson("http://10.254.128.145:8080/shopweb/integration", param);
	}
	
	@Test
	public void pushErp(){
		
		HttpClientUtil client = HttpClientUtil.getInstance();
//		StockReceipt receipt = new StockReceipt();
		
//		String json = "{\"opReceiptId\":0,\"wareTransId\":846221,\"skuId\":1014804,\"originReceipt\":67321696,\"billId\":0,\"wareId\":7,\"inventoryType\":1,\"opType\":2401,\"originReceiptType\":24,\"owerId\":0,\"quantity\":2,\"originNum\":0,\"leftNum\":0,\"frozenFlag\":0,\"receiptType\":24,\"shelfLifeDays\":30,\"skuLot\":\"20170830\",\"originCode\":\"67321696\",\"operator\":0,\"expireDate\":\"2017-09-29 10:04:48\",\"createDate\":\"2017-08-30 10:04:48\",\"productDate\":\"2017-08-30 10:04:48\",\"fromReceipt\":0}";
//		receipt.setReceiptId(67321696);
//		receipt.setWarehouseId(7);
//		receipt.setSkuId(1014804);
//		receipt.setOperationType(2401);
//		receipt.setIsserialNumberGenerator(1);
//		receipt.setContent(json);
		
		String content = "{\"receiptId\":150322751876,\"warehouseId\":7,\"skuId\":10034749,\"bussinessType\":12,\"operationType\":1208,\"content\":\"{\\\"opReceiptId\\\":0,\\\"wareTransId\\\":846369,\\\"skuId\\\":10034749,\\\"originReceipt\\\":150322751876,\\\"billId\\\":0,\\\"wareId\\\":7,\\\"inventoryType\\\":1,\\\"opType\\\":1208,\\\"originReceiptType\\\":12,\\\"owerId\\\":0,\\\"quantity\\\":1,\\\"originNum\\\":0,\\\"leftNum\\\":0,\\\"frozenFlag\\\":0,\\\"receiptType\\\":12,\\\"shelfLifeDays\\\":500,\\\"skuLot\\\":\\\"20170901\\\",\\\"originCode\\\":\\\"67336846\\\",\\\"operator\\\":0,\\\"expireDate\\\":\\\"2019-01-14 15:32:56\\\",\\\"createDate\\\":\\\"2017-09-01 15:32:56\\\",\\\"productDate\\\":\\\"2017-09-01 15:32:56\\\",\\\"fromReceipt\\\":0}\",\"isserialNumberGenerator\":1}";
		StockReceipt receipt = JSONUtil.toObject(content, StockReceipt.class);
		
		try {
			String result = client.doPostForString(url, null, JSONUtil.toJSON(receipt));
			StockResult object = JSONUtil.toObject(result, StockResult.class);
			System.out.println(result);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRequest(){
		try {
			HttpClientUtil instance = HttpClientUtil.getInstance();
			String doGetForString = instance.doGetForString("http://localhost:8080/purchase-retail-server/rest/skuRetail/querySkuRetailInfo");
			System.out.println(doGetForString);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void xxx() throws ClientProtocolException, URISyntaxException, IOException{
//		String sendPost = HttpRequest.sendPost("http://10.254.128.108:8081/services/skuStockCount", "[{\"skuId\":10034773,\"wareId\":36,\"saleType\":1}]");
//		System.out.println(sendPost);
//		HttpUtil httpUtil = new HttpUtil();
//		HttpResponse postJson = httpUtil.postJson("http://10.254.128.108:8081/services/skuStockCount", "[{\"skuId\":10034773,\"wareId\":36,\"saleType\":1}]");
//		System.out.println(JSONUtil.toJSON(postJson));
		HttpClientUtil util = HttpClientUtil.getInstance();
		String json = "[{\"id\":58156,\"chunbo_price\":100.00,\"sku_code\":\"1014349\",\"region_id\":\"320200\"}]";
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("data", json);
		String result = util.doPostRetString("http://catalog1.uat.chunbo.com/ThirdPlat/updatePrice", null, map);
		System.out.println(result);
	}
}
