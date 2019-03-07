package com.mike.kulasinski.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();

        car.sayYourName();
        car.startMoving();
        car.stopMoving();
        dog.sayYourName();
        dog.startMoving();
        dog.stopMoving();
    }
}

interface Movable {
    void startMoving();

    void stopMoving();
}

interface Nameable {
    void sayYourName();
}

class Car implements Movable, Nameable {

    @Override
    public void startMoving() {
        System.out.println("Jade");
    }

    @Override
    public void stopMoving() {
        System.out.println("Stoje");
    }

    @Override
    public void sayYourName() {
        System.out.println("BMW");
    }
}

abstract class Animal implements Movable, Nameable {
    abstract void sayHello();
}

class Duck extends Animal {

    @Override
    public void startMoving() {
        System.out.println("Lece");
    }

    @Override
    public void stopMoving() {
        System.out.println("Siedze");
    }

    @Override
    void sayHello() {
        System.out.println("Kwak kwak");
    }

    @Override
    public void sayYourName() {
        System.out.println("Kaczka");
    }
}

class Dog extends Animal {

    @Override
    public void startMoving() {
        System.out.println("Biegne");
    }

    @Override
    public void stopMoving() {
        System.out.println("Siedze");
    }

    @Override
    void sayHello() {
        System.out.println("Hał hał");
    }

    @Override
    public void sayYourName() {
        System.out.println("Luna");
    }
}