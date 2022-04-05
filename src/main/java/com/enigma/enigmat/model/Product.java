package com.enigma.enigmat.model;

public class Product {
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private Integer stock;

    public Product(Integer productId, String productName, Integer productPrice, Integer stock) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stock = stock;
    }

    public Product() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", stock=" + stock +
                '}';
    }
}
