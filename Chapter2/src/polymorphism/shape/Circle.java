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
//: polymorphism/shape/Circle.java
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void transform() {
        System.out.println("Circle transformed.");
    }
} ///:~
