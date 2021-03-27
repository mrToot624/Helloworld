package com.toot.controller;

import com.toot.pojo.Items;
import com.toot.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Mr.toot
 * @version 1.0.0
 * @ClassName ItemsController
 * @Description TODO
 * @date 3/27/2021 4:25 PM
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        List<Items> items = itemsService.findAll();
        model.addAttribute("items", items);
        return "items";
    }
}
