package com.designpatterns.factorymethod;

import java.util.Map;

public class MythViewEngine {
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Matcha";
    }
}
