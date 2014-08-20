/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.exercises.ex20;

/**
 *
 * @author costa_000
 */
public class Exercise20 {
    
    
    public static void main(String[] args) {
        Bounded<Classy> b = new Bounded<>();
        b.printMe(new Classy());
    }
}

class Bounded<T extends If> {
    private T obj;
    void printMe(T obj) {
        obj.f1();
        obj.f2();
//        obj.f3();
    }
}
    

interface If {

    void f1();

    void f2();
}

class Classy implements If {

    void f3() {
        System.out.println("Inside method f3...");
    }

    @Override
    public void f1() {
        System.out.println("Inside method f1...");
    }

    public void f2() {
        System.out.println("Inside method f2...");
    }
}
