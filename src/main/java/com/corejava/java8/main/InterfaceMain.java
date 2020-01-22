package com.corejava.java8.main;

import com.corejava.java8.interfaces.ComponentResolver;

public class InterfaceMain implements ComponentResolver {

    public static void main(String... args) {
        ComponentResolver.resolveInternalComps();
    }

    @Override
    public boolean resolve() {
        return false;
    }
}
