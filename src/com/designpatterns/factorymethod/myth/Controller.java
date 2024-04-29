package com.designpatterns.factorymethod.myth;

import com.designpatterns.factorymethod.MythViewEngine;
import com.designpatterns.factorymethod.ViewEngine;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context, ViewEngine engine) {
        var html = engine.render(viewName, context);
        System.out.println(html);
    }
}
