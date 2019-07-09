package com.panda.product.core.test.base;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

public class JDBCTest {
	@Test
	public void testDriver() throws Exception{
		//通过反射的方式加载驱动			--不使用具体的子类
		Class clazz = Class.forName("com.mysql.jdbc.Driver");
		Driver driver=(Driver)clazz.newInstance();
		Properties info=new Properties();
		info.setProperty("user", "stock");
		info.setProperty("password", "5Z7C@Viu");
		Connection conn=driver.connect("jdbc:mysql://stockwdb.prod.chunbo.com:3310/supplier_db?useUnicode=true&characterEncoding=UTF-8", info);
		System.out.println(conn);
	}

}
