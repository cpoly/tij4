/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//: operators/PassObject.java
// Passing objects to methods may not be
// what you’re used to.
package operators;

class Letter {
    char c;
}

public class PassObject {

    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }
} /* Output:
 1: x.c: a
 2: x.c: z
 *///:~
