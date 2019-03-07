package com.mike.kulasinski.nestedclass;

public class Main {
    public static void main(String[] args) {

    }

    private static void tworzymyInstancjeStaticNestedClass() {
        OuterClass1.StaticNestedClass nestedClass = new OuterClass1.StaticNestedClass();
    }

    private static void tworzymyInstancjeInnerClass() {
//        OuterClass2.InnerClass innerClass = new OuterClass2.InnerClass(); // ERROR tak nie da sie stworzyc instancji
//        musimy posiadac referencje do classy OuterClass2
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass1 = outerClass2.new InnerClass(); // OK
    }
}
