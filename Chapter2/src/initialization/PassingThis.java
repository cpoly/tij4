/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialization;

/**
 *
 * @author cpolychronopoulos
 */
//: initialization/PassingThis.java
class Person {

    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {

    static Apple peel(Apple apple) {
// ... remove peel
        return apple; // Peeled
    }
}

class Apple {

    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

public class PassingThis {

    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
} /* Output:
 Yummy
 *///:~
