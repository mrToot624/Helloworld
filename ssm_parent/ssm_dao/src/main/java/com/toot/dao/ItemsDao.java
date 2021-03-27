package com.toot.dao;

import com.toot.pojo.Items;

import java.util.List;

public interface ItemsDao {
    Items findById(int id);

    List<Items> findAll();
}
