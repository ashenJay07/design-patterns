package com.designpatterns.factorymethod.myth;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        // Get products from a database
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("product.html", context);
    }
}
