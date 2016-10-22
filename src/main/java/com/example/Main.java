package com.example;

public class Main {

    public static void main(String[] args) {
        com.example.gen.A a = new com.example.gen.A();
        float res = a.getResult(0.1F);
        System.out.println("Result: " + res);
    }
}
