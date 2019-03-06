package com.mike.kulasinski.nestedclass;

public class OuterClass1 {
    private int x;
    private StaticNestedClass nestedClass;

    public OuterClass1() {
        nestedClass = new StaticNestedClass(this);
        nestedClass.y = 100; // OK
    }

    public static class StaticNestedClass {
        private int y;

        public StaticNestedClass() {

        }

        public StaticNestedClass(OuterClass1 outerClass) {
            outerClass.x = 120; // OK
        }
    }
}
