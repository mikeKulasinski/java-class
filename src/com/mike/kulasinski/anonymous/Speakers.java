package com.mike.kulasinski.anonymous;

public class Speakers {
    private String name;

    private Speaker dog;
    private Speaker cat;
    private Speaker human;

    public Speakers(String name) {
        this.name = name;

        int age = 13;

        dog = new Speaker() {
            int age = 10;

            @Override
            public void speakNow() {
                System.out.println(name);           // czytanie pola finalnego z klasy zewnetrznej
                System.out.println("Hał hał mam lat: " + age); // age przyciemni dostep do zmiennej z zewnetrznej klasy age
            }
        };

        cat = new Speaker() {
            @Override
            public void speakNow() {
//                age = 10;                               // ERROR proba zmiany wartosci zmiennej z klasy zewnetrznej
                System.out.println("Miał miał");
            }
        };

        human = new Speaker() {
            //            private static int dob;                     // ERROR nie mozna posiadac statycznych pol i metod
            @Override
            public void speakNow() {
//                name = "Tom";                         // ERROR proba zmiany wartosci pola z klasy zewnetrznej
                System.out.println("Siema mam lat: " + age); // czyanie zmiennej z konstruktora
            }
        };
    }

    interface Speaker {
        void speakNow();
    }
}
