package com.baizhi.service;


import com.baizhi.entity.Product;

import java.util.Map;

public interface ProductService {
    public Map selectAll(int page, int rows);

    public void deletes(int[] ids);

    public void add(Product product);
}
