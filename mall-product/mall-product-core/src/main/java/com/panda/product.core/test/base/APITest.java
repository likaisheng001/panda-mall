package com.panda.product.core.test.base;

import com.panda.mall.common.util.JSONUtil;
import com.panda.product.core.model.Student;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;

/**
 * 测试时间调整
 * @author likaisheng
 *
 */
public class APITest {
	

	@Test
	public void test002(){
		Calendar now=Calendar.getInstance();
		now.set(Calendar.SECOND, 0);
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.MILLISECOND, 0);		
		Date time = now.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(time);
		System.out.println(format);
	}
	
	@Test
	public void test003(){
		String str = "2222#22222#4444";
		String[] split = str.split("#");
		for(String s : split ){
			System.out.println(s);
		}
	}
	
	@Test
	public void tokenerTest(){
		
		String str = new String("pId:17360410,skuId:1003500,price:34.1,saleableQnt:899|xxx:111");
		StringTokenizer goods = new StringTokenizer(str, "|");
		
//		String nextToken = goods.nextToken();
//		String xxx = goods.nextToken();
		
		Object nextElement = goods.nextElement();
		Object xxx = goods.nextElement();
	}
	
	@Test
	public void hashMapTest(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Map<String, String> map = new HashMap<String,String>();
		map.put("1", "李开生");
		map.put("2", "闵杰");
		Set<String> keySet = map.keySet();
		Set<Entry<String, String>> entrySet = map.entrySet();
		entrySet.iterator();
		System.out.println(entrySet.toString());
		System.out.println("-----------------------------");
	}
	
	@Test
	public void sss(){
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.setAge(23);
		inner.setName("likaisheng");
		
		Outer.Inner inner2 = outer.getInner();
		System.out.println();
	}
	@Test
	public void hashMap(){
		Map<Long, String> map = new HashMap<Long,String>();
		map.put(1L, "liaksihegn");
		
		Long long1 = new Long(1);
		
		if(map.containsKey(long1)){
			System.out.println("yes");
		}
		
		map.remove(22L);
		Iterator<Entry<Long, String>> iterator = map.entrySet().iterator();
		iterator.hasNext();
		Entry<Long, String> next = iterator.next();
		System.out.println(JSONUtil.toJSON(map));
		
		Set<String> list = new HashSet<String>();
		list.add("111");
		list.add(null);
		list.add("222");
		list.add("333");
		list.add(null);
		list.remove(null);
		list.remove(null);
		list.remove(null);
		System.out.println(list.size());
	}
	@Test
	public void bigdecimal(){
		Double dou =111231.5554;  
		BigDecimal b1 = new BigDecimal(4.57);
		BigDecimal b2 = new BigDecimal(1.1);
//		System.out.println(b1.compareTo(BigDecimal.ZERO));
		
//		System.out.println(b1.add(b2));
		
//		System.out.println("-------"+b1);
//		System.out.println("-------"+b2);
//		b1.divide(new BigDecimal(2));
		 
		BigDecimal   b   =   new   BigDecimal(dou);  
		double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();  
		System.out.println("=============" + f1);
	}
	
	@Test
	public void dateTest() throws ParseException{
		String str = "0000-00-00 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = sdf.parse(str);
		System.out.println("------"+parse);
	}
	
	@Test
	public void stringTest(){
		Integer i = new Integer(102);
		System.out.println(addZeroForNum(i.toString(), 5));
	}
	public static String addZeroForNum(String str, int strLength) {  
	    int strLen = str.length();  
	    if (strLen < strLength) {  
	        while (strLen < strLength) {  
	            StringBuffer sb = new StringBuffer();  
	            sb.append("0").append(str);// 左补0  
	            // sb.append(str).append("0");//右补0  
	            str = sb.toString();  
	            strLen = str.length();  
	        }  
	    }  
	    return str;  
	}  
	
	@Test
	public void splitTest(){
		String str = "a,b,c,,";
		String[] ary = str.split(",");
		System.out.println(ary.length);
	}
	
	@Test
	public void stringBuilderTest(){
		String str = "start";
		StringBuilder stringBuilder = new StringBuilder(str);
		for(int i = 0; i < 100; i++){
			stringBuilder.append(i+"");
		}
		System.out.println(stringBuilder.toString());
	}
	@Test
	public void subListTest(){
		List<Object> list = new ArrayList<>();
		list.subList(1, 10);
	}
	@Test
	public void toArrayTest(){
		List<Long> list = new ArrayList<Long>();
		for(int i = 0; i < 10; i++){
			list.add(new Long(i));
		}
		Object[] array = list.toArray();
		
		Long[] customArray = new Long[20];
		Long[] array2 = list.toArray(customArray);
		System.out.println(customArray.length + "");
		System.out.println(array2.length);
	}
	
	@Test
	public void asList(){
		String[] arrayStr = new String[10];
		for(int i = 0; i < 10; i ++){
			arrayStr[i] = i + "";
		}
		List<String> asList = Arrays.asList(arrayStr);
//		asList.add("5");
		arrayStr[0] = "y";
		System.out.println(asList);
	}
	@Test
	public void foreachTest(){
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
//		for(String temp : list){
//			if("1".equals(temp)){
//				list.remove(temp);
//			}
//		}
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String temp = it.next();
			if("2".equals(temp)){
				it.remove();
			}
		}
		System.out.println(list);
	}
	
	@Test
	public void comparatorTest(){
		new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getId() > o2.getId() ? 1 : -1;
			}
		};
	}
	@Test
	public void createThreadTest(){
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,20,4L,TimeUnit.MINUTES,new LinkedBlockingQueue<Runnable>());
	}
	@Test
	public void NPETest(){
		int f = f();
		System.out.println(f);
	}
	private int f(){
		Integer i = null;
		return i;
	}
	
	@Test
	public void bigDecibal(){
		BigDecimal a = new BigDecimal(10);
		BigDecimal b = new BigDecimal(0.3);
//		BigDecimal c = a.subtract(b);
		
		System.out.println("###" + b.doubleValue());
	}
}
