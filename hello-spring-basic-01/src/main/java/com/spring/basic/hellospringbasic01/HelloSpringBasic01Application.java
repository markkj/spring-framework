package com.spring.basic.hellospringbasic01;

import com.spring.basic.hellospringbasic01.basic.BinarySearch;
import com.spring.basic.hellospringbasic01.cdi.SomeCDIBusiness;
import com.spring.basic.hellospringbasic01.controller.SomeController;
import com.spring.basic.hellospringbasic01.service.SomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableFeignClients
public class HelloSpringBasic01Application {

	private static Logger LOGGER = LoggerFactory.getLogger(HelloSpringBasic01Application.class);



	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(HelloSpringBasic01Application.class);
//		ConfigurableApplicationContext context = SpringApplication.run(HelloSpringBasic01Application.class, args);
		System.out.println(context.getBeanDefinitionNames().length);
//
		BinarySearch binarySearch = context.getBean(BinarySearch.class);
		binarySearch.binarySearch(new int[]{1,2,3,4},3);
		System.out.println(binarySearch);

		SomeCDIBusiness business = context.getBean(SomeCDIBusiness.class);

		LOGGER.info("{} dao -{}",business,business.getSomeCDIDao());

		SomeController controller = context.getBean(SomeController.class);
		LOGGER.info("{} dao -{}",controller,controller.getUsername("s"));
		LOGGER.info("{} dao -{}",controller,controller.getPosts());



	}

	@Bean
	feign.Logger.Level feignLoggerLevel(){
		return feign.Logger.Level.FULL;
	}
}
