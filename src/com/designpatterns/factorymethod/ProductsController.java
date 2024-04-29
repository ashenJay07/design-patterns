package com.designpatterns.factorymethod;

import com.designpatterns.factorymethod.myth.Controller;
import com.designpatterns.factorymethod.myth.MythViewEngine;
import com.designpatterns.factorymethod.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProducts() {
        // Get products from a database
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("product.html", context);
    }
}
