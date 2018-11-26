package com.baizhi.service;


import com.baizhi.dao.ProductDao;
import com.baizhi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Map selectAll(int page, int rows) {
        //计算起始数
        int start = (page - 1) * rows;


        List<Product> list = productDao.selectAll(start, rows);
        int count = productDao.count();
        Map map = new HashMap();
        map.put("rows", list);
        map.put("total", count);
        return map;
    }

    @Override
    public void deletes(int[] ids) {
        productDao.deletes(ids);
    }

    @Override
    public void add(Product product) {
        productDao.add(product);
    }
}
