package com.example.beardbalmbeast.models.products;

import javax.persistence.*;
import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Products {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String productName;
    public int productPrice;
    public ImageIcon productImage;
    public int productStockNumber;
    public String productType;

    //    many to many? Many products can belong to many carts?
    //    @ManyToMany(cascade = CascadeType.REMOVE)
    //    public Set<Cart> listOfCarts = new HashSet<>();

    public Products(String productName, int productPrice, ImageIcon productImage, int productStockNumber, String productType){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.productStockNumber = productStockNumber;
        this.productType = productType;
    }

    public Products(){}

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public ImageIcon getProductImage() {
        return productImage;
    }

    public void setProductImage(ImageIcon productImage) {
        this.productImage = productImage;
    }

    public int getProductStockNumber() {
        return productStockNumber;
    }

    public void setProductStockNumber(int productStockNumber) {
        this.productStockNumber = productStockNumber;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
