/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators.exercises.ex6;

import operators.exercises.*;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise6 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3;
        d3 = d1;

        d1.name = "spot";
        d1.says = "Ruff!";

        d2.name = "scruffy";
        d2.says = "Wurff!";

        System.out.println(d1 == d3);
        System.out.println(d1.equals(d3));
        
        System.out.println(d2 == d3);
        System.out.println(d2.equals(d3));

        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));

    }
}
