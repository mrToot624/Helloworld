package com.toot.service.impl;

import com.toot.dao.ItemsDao;
import com.toot.pojo.Items;
import com.toot.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr.toot
 * @version 1.0.0
 * @ClassName ItemsServiceImpl
 * @Description TODO
 * @date 3/27/2021 4:01 PM
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(int id) {
        return itemsDao.findById(id);
    }

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }
}
