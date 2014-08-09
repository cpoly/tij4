/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.shape;

/**
 *
 * @author costantis
 */
//: polymorphism/shape/Triangle.java
public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
    
        @Override
    public void transform() {
        System.out.println("Triangle transformed.");
    }
} ///:~
