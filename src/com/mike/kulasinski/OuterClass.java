package com.mike.kulasinski;

public class OuterClass {
    private int x;
    private StaticNestedClass nestedClass;

    public OuterClass() {
        nestedClass = new StaticNestedClass(this);
        nestedClass.y = 100; // OK
    }

    public static class StaticNestedClass {
        private int y;

        public StaticNestedClass(OuterClass outerClass){
            outerClass.x = 120; // OK
        }
    }
}
