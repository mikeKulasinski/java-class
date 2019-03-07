package com.mike.kulasinski.abstraction;

public class Main {

    public static void main(String[] args) {
        Animal animalDog = new Dog();
        Animal animalCat = new Cat();

        animalDog.sayHello();
        animalCat.sayHello();
    }

}

abstract class Animal {
    abstract void sayHello();
}

class Cat extends Animal {
    @Override
    void sayHello() {
        System.out.println("Miał miał");
    }
}

class Dog extends Animal {
    @Override
    void sayHello() {
        System.out.println("Hał hał");
    }
}

