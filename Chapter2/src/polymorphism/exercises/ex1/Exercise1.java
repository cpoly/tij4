/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.exercises.ex1;

/**
 *
 * @author costantis
 */
public class Exercise1 {

    public static void main(String[] args) {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();
        wander(uni);
        wander(bi);
        wander(tri);
    }

    static void wander(Cycle c) {
        c.ride();
        System.out.println(c.getClass().getSimpleName() + " wanders with " + c.wheels() + " wheels.");
    }
}

class Cycle {

    void ride() {
        System.out.println("Cycle ride");
    }

    public int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {

    @Override
    public int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {

    @Override
    public int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {

    @Override
    public int wheels() {
        return 3;
    }
}
