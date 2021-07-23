//package com.springboot.springbootdemo;
//
//
////import com.springboot.springbootdemo.jdbc.person.PersonJdbcDao;
//import com.springboot.springbootdemo.jpa.person.Person;
//import com.springboot.springbootdemo.jpa.person.PersonJpaRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.Date;
//
//@SpringBootApplication
//public class SpringBootJpaApplication implements CommandLineRunner{
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    PersonJpaRepository repository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringBootJpaApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        logger.info("User id 1001 -> {}" ,repository.findByID(1001));
//        logger.info("User id 1001 -> {}" ,repository.insert(new Person("mark","bangkok",new Date())));
//        logger.info("User id 1001 -> {}" ,repository.findByID(1));
//        repository.deleteByID(1);
//        logger.info("Delete ");
//        logger.info("User id 1001 -> {}" ,repository.findByID(1));
//        logger.info("User id 1001 -> {}" ,repository.insert(new Person("mark","bangkok",new Date())));
//        logger.info("User id 1001 -> {}" ,repository.insert(new Person("fff","bangkok",new Date())));
//
//        logger.info("find all -> {}",repository.findAll());
//
//    }
//}
