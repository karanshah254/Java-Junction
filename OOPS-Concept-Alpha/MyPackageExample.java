package com.example;

public class MyPackageExample {
    public static void main(String[] args) {
        System.out.println("Hello from package example");
    }
}

// javac -d out src/com/example/MyPackageExample.java
// java -cp out com.example.MyPackageExample