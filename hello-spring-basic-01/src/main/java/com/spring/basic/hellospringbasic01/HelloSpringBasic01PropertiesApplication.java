package com.spring.basic.hellospringbasic01;

import com.spring.basic.hellospringbasic01.properties.SomeExternalService;
import com.spring.basic.hellospringbasic01.xml.XmlPersonDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class HelloSpringBasic01PropertiesApplication {


	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext context =
					new AnnotationConfigApplicationContext(HelloSpringBasic01PropertiesApplication.class)){

			SomeExternalService service = context.getBean(SomeExternalService.class);
			System.out.println(service.returnServiceURL());
		}
	}
}
