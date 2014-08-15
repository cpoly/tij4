/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holding.exercises.ex31;

/**
 *
 * @author costa_000
 */
import java.util.Iterator;
import java.util.Random;
import polymorphism.shape.*;

public class Exercise31 implements Iterable<Shape> {

    int maxNumber;
    
    public static void main(String[] args) {
        Exercise31 ex31 = new Exercise31(10);
        for (Shape shape : ex31) {
            shape.draw();
        }
    }

    Exercise31(int number) {
        this.maxNumber = number;
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {

            int index = 0;
            private final Random rand = new Random();

            @Override
            public boolean hasNext() {
                return index < maxNumber;
            }

            @Override
            public Shape next() {
                index++;
                switch (rand.nextInt(3)) {
                    default:
                    case 0:
                        return new Circle();
                    case 1:
                        return new Square();
                    case 2:
                        return new Triangle();
                }
            }
        };
    }
}
