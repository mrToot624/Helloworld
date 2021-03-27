package com.toot.test;

import com.toot.dao.ItemsDao;
import com.toot.pojo.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.toot
 * @version 1.0.0
 * @ClassName DaoTest
 * @Description TODO
 * @date 3/27/2021 3:03 PM
 */
public class DaoTest {

    @Test
    public void testDao(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = app.getBean(ItemsDao.class);
        Items item = itemsDao.findById(2);
        System.out.println(item);
    }
}
