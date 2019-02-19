package com.mike.kulasinski;

public class Main {

    public static void main(String[] args) {
        System.out.println(overloadingOne());
        System.out.println(overloadingOne(10));
    }

    private static int overloadingOne() {
        return 0;
    }

    private static String overloadingOne(int x) {
        return "Test: " + x;
    }
}
