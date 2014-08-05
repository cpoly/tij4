/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author cpolychronopoulos
 */
//: operators/AutoInc.java
// Demonstrates the ++ and -- operators.
public class AutoInc {

    public static void main(String[] args) {
        int i = 1;
        System.out.println("i : " + i);
        System.out.println("++i : " + ++i); // Pre-increment
        System.out.println("i++ : " + i++); // Post-increment
        System.out.println("i : " + i);
        System.out.println("--i : " + --i); // Pre-decrement
        System.out.println("i-- : " + i--); // Post-decrement
        System.out.println("i : " + i);
    }
} /* Output:
 i : 1
 ++i : 2
 i++ : 2
 i : 3
 --i : 2
 i-- : 2
 i : 1
 *///:~
