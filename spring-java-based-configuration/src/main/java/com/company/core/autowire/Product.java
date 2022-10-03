package com.company.core.autowire;

public class Product {
    private long id;
    private String productDesc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
