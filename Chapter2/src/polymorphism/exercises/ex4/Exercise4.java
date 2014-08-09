/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism.exercises.ex4;

import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape.Shape;

/**
 *
 * @author costantis
 */
public class Exercise4 {
    private static RandomShapeGenerator gen
            = new PentRandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
// Fill up the array with shapes:
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
// Make polymorphic method calls:
        for (Shape shp : s) {
            {
                shp.draw();
                shp.transform();
            }
        }
    }
}
