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
//: generics/GenericWriting.java
import java.util.*;

public class GenericWriting {

    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<>();
    static List<Fruit> fruit = new ArrayList<>();

    static void f1() {
        writeExact(apples, new Apple());
// writeExact(fruit, new Apple()); // Error:
// Incompatible types: found Fruit, required Apple
    }

    static <T> void
            writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruit, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }

    private static class Apple extends Fruit {

        public Apple() {
        }
    }

    private static class Fruit {

        public Fruit() {
        }
    }
} ///:~
