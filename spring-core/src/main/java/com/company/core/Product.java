package com.company.core;

import java.beans.ConstructorProperties;

public class Product {
    private Long productId;
    private String productName;
    private Integer productPrice;

    //@ConstructorProperties({"productId","productName","price"})
    public Product(Long productId, String productName, Integer productPrice) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
