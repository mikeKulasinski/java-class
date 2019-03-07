package com.mike.kulasinski.inheritance;

final class FinalPerson {

}

//class Policeman extends FinalPerson {} // ERROR

class NonFinalPerson {
    final void sayName() {
        System.out.println("Witam");
    }
}

class PoliceMan extends NonFinalPerson {
//    void sayName() { } // ERROR
}