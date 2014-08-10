/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.exercises.ex3;

/**
 *
 * @author costantis
 */
abstract class Printer {

    Printer() {
        new LaserPrinter().print();
    }

    abstract void print();
}

class LaserPrinter extends Printer {

    int dpi = 600;

    @Override
    void print() {
        System.out.println("LaserPrinter dpi: " + dpi);
    }
}

public class Exercise3 {

    public static void main(String[] args) {
        new LaserPrinter().print();
    }
}
/* Output: One constructor calls the other: 
 Exception: java.lang.StackOverflowError
 */
