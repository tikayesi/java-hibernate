package com.enigma.enigmat.model;

public class PurchaseDetail {
    private Integer purchaseDetailId;
    private Integer purchaseId;
    private Integer productPrice;
    private Integer quantity;
    private Product product;

    public PurchaseDetail(Integer purchaseDetailId, Integer purchaseId, Integer productPrice, Integer qunatity, Product product) {
        this.purchaseDetailId = purchaseDetailId;
        this.purchaseId = purchaseId;
        this.productPrice = productPrice;
        this.quantity = qunatity;
        this.product = product;
    }

    public PurchaseDetail() {
    }

    public Integer getPurchaseDetailId() {
        return purchaseDetailId;
    }

    public void setPurchaseDetailId(Integer purchaseDetailId) {
        this.purchaseDetailId = purchaseDetailId;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "PurchaseDetail{" +
                "purchaseDetailId=" + purchaseDetailId +
                ", purchaseId=" + purchaseId +
                ", productPrice=" + productPrice +
                ", qunatity=" + quantity +
                ", product=" + product +
                '}';
    }
}
