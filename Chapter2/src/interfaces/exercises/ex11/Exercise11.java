/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.exercises.ex11;

import interfaces.*;

/**
 *
 * @author costantis
 */
public class Exercise11 {

    public static void main(String[] args) {
        String s = "This is a string.";
        Apply.process(new SwapperAdapter(new Swapper()), s);

    }
}

class Swapper {

    String swap(String s) {
        char[] initial = s.toCharArray();
        for (int i = 0; i < initial.length - 1; i += 2) {
            char temp = initial[i];
            initial[i] = initial[i + 1];
            initial[i + 1] = temp;
        }
        return new String(initial);
    }

    public String name() {
        return getClass().getSimpleName();
    }

    public String process(Object input) {
        return swap((String) input);
    }
}

class SwapperAdapter implements Processor {

    Swapper swapper;

    public SwapperAdapter(Swapper swapper) {
        this.swapper = swapper;
    }

    @Override
    public String name() {
        return swapper.name();
    }

    @Override
    public String process(Object input) {
        return swapper.process((String) input);
    }
}
