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
//: polymorphism/shape/Square.java
public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
    
    @Override
    public void transform() {
        System.out.println("Square transformed.");
    }
} ///:~
