package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.dao.JdbcDaoImpl;
import com.jdbc.dao.SimpleJdbcImpl;
import com.jdbc.model.Circle;

public class JdbcDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl jdbcDaoImpl = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		//Circle circle = jdbcDaoImpl.getCircle(1);
		//System.out.println(circle.getName());

		System.out.println(jdbcDaoImpl.getCircleCount());
		System.out.println(jdbcDaoImpl.getCircleName(1));
		System.out.println(jdbcDaoImpl.getCircleForId(2));
		System.out.println(jdbcDaoImpl.getAllCircles());


		SimpleJdbcImpl simplejdbcDaoImpl = ctx.getBean("SimpleJdbcImpl", SimpleJdbcImpl.class);
		System.out.println("count : "+simplejdbcDaoImpl.getCirclesCount());
	}


}
