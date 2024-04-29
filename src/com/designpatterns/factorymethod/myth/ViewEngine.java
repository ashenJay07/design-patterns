package com.designpatterns.factorymethod.myth;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
