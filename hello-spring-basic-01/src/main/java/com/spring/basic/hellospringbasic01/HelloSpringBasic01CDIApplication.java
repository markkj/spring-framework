//package com.spring.basic.hellospringbasic01;
//
//import com.spring.basic.hellospringbasic01.cdi.SomeCDIBusiness;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//@SpringBootApplication
//public class HelloSpringBasic01CDIApplication {
//
//	private static Logger LOGGER = LoggerFactory.getLogger(HelloSpringBasic01CDIApplication.class);
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = SpringApplication.run(HelloSpringBasic01CDIApplication.class, args);
//		System.out.println(context.getBeanDefinitionNames().length);
//
//		SomeCDIBusiness business = context.getBean(SomeCDIBusiness.class);
//
//		LOGGER.info("{} dao -{}",business,business.getSomeCDIDao());
//
//
//	}
//}
