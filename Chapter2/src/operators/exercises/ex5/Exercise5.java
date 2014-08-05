/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators.exercises.ex5;

import operators.exercises.*;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise5 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name = "spot";
        d1.says = "Ruff!";

        d2.name = "scruffy";
        d2.says = "Wurff!";

        System.out.println(d1.sayName());
        System.out.println(d2.sayName());

    }
}
