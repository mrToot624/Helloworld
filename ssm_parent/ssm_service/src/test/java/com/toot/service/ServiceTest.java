package com.toot.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.toot
 * @version 1.0.0
 * @ClassName ServiceTest
 * @Description TODO
 * @date 3/27/2021 4:03 PM
 */
public class ServiceTest {
    @Test
    public void ServiceTest(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService item = app.getBean(ItemsService.class);
        System.out.println(item.findById(2));
    }
}
