/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reuse.exercises.ex23;

/**
 *
 * @author costantis
 */
public class Exercise23 {

    static int stat = 23;

    public Exercise23() {
        System.out.println("Inside contstructor");
        stat = 24;
        System.out.println("stat=" + stat);
    }

    public static void main(String[] args) {
//        Exercise23 ex = new Exercise23();
        System.out.println("stat=" + Exercise23.stat);
        Exercise23 ex = new Exercise23();
        System.out.println("stat=" + Exercise23.stat);
    }
}
