package test.com.panda.product.core.test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 测试时间调整
 * @author likaisheng
 *
 */
public class DateAbjustTest {
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
}
