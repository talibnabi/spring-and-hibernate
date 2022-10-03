package com.company.core.scope;

public class Product {
    private long productId;
    private String productDesc;

    public Product(long productId, String productDesc) {
        this.productId = productId;
        this.productDesc = productDesc;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
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
                "productId=" + productId +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
