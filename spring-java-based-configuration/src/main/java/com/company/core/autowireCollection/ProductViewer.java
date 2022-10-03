package com.company.core.autowireCollection;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class ProductViewer {
    //    @Autowired
//    private List<Product> products;
//
//    public void viewProduct() {
//        for (Product product : products) {
//            System.out.println(product);
//        }
//    }
    @Autowired
    private Map<String, Product> products;

    public void viewProduct() {
        for (Map.Entry<String, Product> product : products.entrySet()) {
            System.out.println(product.getKey()+"-------->"+product.getValue());
        }
    }
}
