package com.designpatterns;

import com.designpatterns.singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Ashen");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
