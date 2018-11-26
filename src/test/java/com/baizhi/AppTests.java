package com.baizhi;

import com.baizhi.entity.Product;
import com.baizhi.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTests {
    @Autowired
    private ProductService productService;

    @Test
    public void contextLoads() {
        Map map = productService.selectAll(1, 10);
        List<Product> rows = (List<Product>) map.get("rows");
        for (Product p : rows
        ) {
            System.out.println(p + "");

        }
    }

}
