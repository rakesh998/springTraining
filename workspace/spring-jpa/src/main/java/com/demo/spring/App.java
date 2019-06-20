package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.entity.Emp;
import com.demo.spring.entity.EmpDaoJpaImpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmpDaoJpaImpl dao=(EmpDaoJpaImpl)ctx.getBean("dao");
		String resp=dao.saveEmp(new Emp(109,"abc","Hyd",1000));
		System.out.println(resp);
	}

}
