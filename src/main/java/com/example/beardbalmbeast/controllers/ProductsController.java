package com.example.beardbalmbeast.controllers;

import com.example.beardbalmbeast.models.cart.CartRepository;
import com.example.beardbalmbeast.models.products.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductsController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CartRepository cartRepository;

}
