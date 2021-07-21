//package com.spring.basic.hellospringbasic01;
//
//import com.spring.basic.componentscan.ComponentDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//
//@SpringBootApplication
//@ComponentScan("com.spring.basic.componentscan")
//public class HelloSpringBasic01ComponentScanApplication {
//
//	private static Logger LOGGER = LoggerFactory.getLogger(HelloSpringBasic01ComponentScanApplication.class);
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = SpringApplication.run(HelloSpringBasic01ComponentScanApplication.class, args);
//		System.out.println(context.getBeanDefinitionNames().length);
//
//		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
//		LOGGER.info("{}",componentDAO);
//		LOGGER.info("{}",componentDAO.getJdbcConnection());
//
//
//
//
//	}
//}
