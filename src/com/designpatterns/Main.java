package com.designpatterns;

import com.designpatterns.singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = new ConfigManager();
        manager.set("name", "Ashen");

        ConfigManager other = new ConfigManager();
        System.out.println(other.get("name"));
    }
}
