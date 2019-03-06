package com.mike.kulasinski.nestedclass;

public class OuterClass2 {
    private int x;
    private InnerClass innerClass;

    public OuterClass2() {
        innerClass = new InnerClass();
        innerClass.y = 100; // OK
    }

    public class InnerClass {
        private int y;

        public InnerClass() {
            x = 120; // OK
            OuterClass2.this.x = 120; // OK takie same jak powyzej z pelna referencja w razie kolizji nazw pol
        }

        public static void test() { // ERROR nie ma static w inner classes!

        }

    }
}
