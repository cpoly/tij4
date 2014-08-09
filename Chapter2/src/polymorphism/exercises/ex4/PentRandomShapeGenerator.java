/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.exercises.ex4;

import polymorphism.shape.Circle;
import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape.Shape;
import polymorphism.shape.Square;
import polymorphism.shape.Triangle;

/**
 *
 * @author costantis
 */
class PentRandomShapeGenerator extends RandomShapeGenerator {

    @Override
    public Shape next() {
        switch (rand.nextInt(5)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Pentagon();
        }
    }

}
