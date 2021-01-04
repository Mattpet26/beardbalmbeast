package com.example.beardbalmbeast.models.cart;

import com.example.beardbalmbeast.models.user.AppUser;

import javax.persistence.*;
import java.util.HashSet;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    private String[] cartItems;

    public Cart(){}

    public Cart(String[] cartItems){
        this.cartItems = cartItems;
    }

    //               -- One user can have one cart --
    @OneToOne
    public AppUser appUser;


    //               -- Many items belong to many carts --
//    @ManyToOne
//    public Products products;
//
//    public Set<Product> productInCart = new HashSet<>();


}
