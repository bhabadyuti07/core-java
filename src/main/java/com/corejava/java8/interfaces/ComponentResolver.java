package com.corejava.java8.interfaces;

public interface ComponentResolver {

    private static boolean resolveExternalComponents() {
        return true;
    }

    static boolean resolveInternalComps() {
        return resolveExternalComponents();
    }

    static boolean isResolved() {
        return false;
    }

    boolean resolve();
}
