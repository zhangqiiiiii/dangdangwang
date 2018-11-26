package com.baizhi.controller;

import com.baizhi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService cs;

    @RequestMapping("/select")
    public @ResponseBody
    Map select() {
        return cs.select();
    }
}
