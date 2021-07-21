package com.spring.basic.hellospringbasic01;

import com.spring.basic.hellospringbasic01.basic.BinarySearch;
import com.spring.basic.hellospringbasic01.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HelloSpringBasic01Application {

	private static Logger LOGGER = LoggerFactory.getLogger(HelloSpringBasic01Application.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(HelloSpringBasic01Application.class);
		System.out.println(context.getBeanDefinitionNames().length);
//
		BinarySearch binarySearch = context.getBean(BinarySearch.class);
		binarySearch.binarySearch(new int[]{1,2,3,4},3);
		System.out.println(binarySearch);

		SomeCDIBusiness business = context.getBean(SomeCDIBusiness.class);

		LOGGER.info("{} dao -{}",business,business.getSomeCDIDao());

	}
}
