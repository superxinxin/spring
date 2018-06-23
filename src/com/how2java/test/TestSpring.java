package com.how2java.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring
{
	@Autowired
	Product p;
	
	@Autowired
	ProductService ps;

	@Test
	public void test()
	{
		System.out.println(p.getName());
		System.out.println(p.getCategory().getName());
		ps.doSomeService();
	}
}
