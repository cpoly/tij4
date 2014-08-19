/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author costa_000
 */
//: generics/Holder3.java
public class Holder3<T> {

    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile a = h3.get(); // No cast needed
// h3.set("Not an Automobile"); // Error
// h3.set(1); // Error
    }

    private static class Automobile {

        public Automobile() {
        }
    }
} ///:~
