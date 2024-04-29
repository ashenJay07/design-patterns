package com.designpatterns.factorymethod.myth;

import com.designpatterns.factorymethod.MythViewEngine;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        var engine = new MythViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }
}
