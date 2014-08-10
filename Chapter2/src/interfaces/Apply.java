/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author costantis
 */
import java.util.*;

class Upcase implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) { // Covariant return
        return ((String) input).toUpperCase();
    }
}

class Downcase implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
// The split() argument divides a String into pieces:
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {

    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
    public static String s
            = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
} /* Output:
 Using Processor Upcase
 DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT
 Using Processor Downcase
 disagreement with beliefs is by definition incorrect
 Using Processor Splitter
 [Disagreement, with, beliefs, is, by, definition, incorrect]
 *///:~
