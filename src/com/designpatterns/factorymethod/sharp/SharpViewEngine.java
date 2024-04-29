package com.designpatterns.factorymethod.sharp;

import com.designpatterns.factorymethod.myth.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Sharp";
    }
}
