/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holding;

/**
 *
 * @author costa_000
 */
import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {

    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return () -> new Iterator<T>() {
            int current = size() - 1;

            public boolean hasNext() {
                return current > -1;
            }

            public T next() {
                return get(current--);
            }

            public void remove() {
                // Not implemented             
                throw new UnsupportedOperationException();
            }
        };
    }
};

public class AdapterMethodIdiom {

    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        // Grabs the ordinary iterator via iterator():     
        for (String s : ral) {
            System.out.print(s + " ");
        }
        System.out.println();
// Hand it the Iterable of your choice     
        for (String s : ral.reversed()) {
            System.out.print(s + " ");
        }
    }
} /* Output: To be or not to be be to not or be To *///:~ 
