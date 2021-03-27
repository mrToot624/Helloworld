package com.toot.service;

import com.toot.pojo.Items;

import java.util.List;

public interface ItemsService {
    Items findById(int id);

    List<Items> findAll();
}
