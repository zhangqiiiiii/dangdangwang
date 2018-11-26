package com.baizhi.dao;

import com.baizhi.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    public List<Product> selectAll(@Param("start") int start, @Param("rows") int rows);

    public int count();

    public void deletes(int[] ids);

    public void add(Product product);
}
