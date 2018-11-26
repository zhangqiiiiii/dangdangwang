package com.baizhi.controller;

import com.baizhi.entity.Product;
import com.baizhi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    private ProductService ps;

    @RequestMapping("selectAll")
    public @ResponseBody
    Map selectAll(int page, int rows) {
        Map map = ps.selectAll(page, rows);
        List<Product> ss = (List<Product>) map.get("rows");
        for (Product p : ss) {
            System.out.println(p);
        }
        return map;
    }

    @RequestMapping("/deletes")
    public @ResponseBody
    boolean deletes(int[] ids) {
        try {
            ps.deletes(ids);
            System.out.println("删除的打印" + ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("/add")
    public @ResponseBody
    boolean add(Product product) {
        try {
            ps.add(product);
            System.out.println("添加打印" + product);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
