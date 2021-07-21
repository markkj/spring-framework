package com.spring.basic.hellospringbasic01;

import com.spring.basic.hellospringbasic01.xml.XmlPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class HelloSpringBasic01XmlApplication {


	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("applicationContext.xml")){
			System.out.println(context.getBeanDefinitionNames().length);
			XmlPersonDAO personDAO = context.getBean(XmlPersonDAO.class);
			System.out.println(personDAO);
			System.out.println(personDAO.getXmlJdbcConnection());
		}
	}
}
