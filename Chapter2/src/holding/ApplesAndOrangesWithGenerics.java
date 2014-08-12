/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holding;

/**
 *
 * @author cpolychronopoulos
 */
//: holding/ApplesAndOrangesWithGenerics.java
import java.util.*;

public class ApplesAndOrangesWithGenerics {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        for (Apple apple : apples) {
            System.out.println(apple.id());
        }
// Using foreach:
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
} /* Output:
 0
 1
 2
 0
 1
 2
 *///:~
