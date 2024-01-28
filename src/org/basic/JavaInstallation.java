package org.basic;

public class JavaInstallation {
    public static void main(String[] args) {
        System.out.println("Java version: "+ System.getProperty("java.version"));
        System.out.println("Java runtime version: "+ System.getProperty("java.runtime.version"));
        System.out.println("Java class path: "+ System.getProperty("java.class.path"));

    }
}
