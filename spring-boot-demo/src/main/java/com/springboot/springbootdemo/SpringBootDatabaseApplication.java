//package com.springboot.springbootdemo;
//
//
//import com.springboot.springbootdemo.jdbc.person.Person;
//import com.springboot.springbootdemo.jdbc.person.PersonJdbcDao;
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
//public class SpringBootDatabaseApplication implements CommandLineRunner{
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    PersonJdbcDao dao;
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringBootDatabaseApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        logger.info("all Users -> {}",dao.findAll());
//        logger.info("User id = 10001 -> {}",dao.findByID(10001));
//        logger.info("Delete user id = 10002 -> {}",dao.deleteByID(10002));
//        logger.info("Insert user id = 10004 -> {}",dao.insert(new Person(1004,"Mark","Bangkok", new Date())));
//        logger.info("update user id = 10004 -> {}",dao.update(new Person(1004,"Markzaza","Siam Park", new Date())));
//    }
//}
