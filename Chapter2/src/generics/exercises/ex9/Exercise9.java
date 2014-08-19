/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.exercises.ex9;

/**
 *
 * @author costa_000
 */
//: generics/Exercise9.java
public class Exercise9 {

    public <T, U, V> void f(T x, U y, V z) {
        System.out.println("x: " + x.getClass().getName());
        System.out.println("y: " + y.getClass().getName());
        System.out.println("z: " + z.getClass().getName());
    }

    public static void main(String[] args) {
        Exercise9 gm = new Exercise9();
        gm.f("", 1, 1.0);
        gm.f(1.0F, 'c', gm);
    }
} /* Output:
 java.lang.String
 java.lang.Integer
 java.lang.Double
 java.lang.Float
 java.lang.Character
 Exercise9
 *///:~
