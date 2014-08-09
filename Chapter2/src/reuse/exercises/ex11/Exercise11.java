/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reuse.exercises.ex11;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise11 {
        public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

class Cleanser {

    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class Detergent {

    private Cleanser cl = new Cleanser();
    
    public void append(String a) {
        cl.append(a);
    }    
    public void dilute() {
        cl.dilute();
    }

    public void apply() {
        cl.apply();
    }
    public void scrub() {
        cl.append(" Detergent.scrub()");
        cl.scrub(); // Call base-class version
    }
// Add methods to the interface:
    public String toString() {
        return cl.toString();
    }
    
    public void foam() {
        append(" foam()");
    }
// Test the new class:


}