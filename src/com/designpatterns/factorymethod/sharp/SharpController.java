package com.designpatterns.factorymethod.sharp;

import com.designpatterns.factorymethod.myth.Controller;
import com.designpatterns.factorymethod.myth.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
