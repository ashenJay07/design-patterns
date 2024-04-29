package com.designpatterns.factorymethod.myth;

import java.util.Map;

public class MythViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Myth";
    }
}
