/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers.exercises.ex7;

import containers.Countries;
import java.util.*;

/**
 *
 * @author costa_000
 */
public class Exercise7 {

    private static final List<String> l = new ArrayList(Countries.names(10));
    private static final List<String> al = new LinkedList(Countries.names(5));

    static <T> void print(List<T> countries) {
        for (Iterator<T> cit = countries.iterator(); cit.hasNext();) {
            T t = cit.next();
            System.out.print(t + (cit.hasNext() ? ", " : ""));
        }
        System.out.println();
    }

    static <T> List<T> insert(List<T> merger, List<T> mergee) {

        ListIterator<T> rt = merger.listIterator(), et = mergee.listIterator();

        while (rt.hasNext() && et.hasNext()) {
            rt.next();
            T t1 = et.next();
            rt.add(t1);
        }

        return merger;
    }

    static <T> List<T> insert(List<T> merger, List<T> mergee, boolean reverse) {
        
        ListIterator<T> rt = merger.listIterator(merger.size()), et = mergee.listIterator();

        while (rt.hasPrevious() && et.hasNext()) {
            rt.previous();
            T t1 = et.next();
            rt.add(t1);
        }

        return merger;
    }

    public static void main(String[] args) {
        print(l);
        print(al);
        print(insert(l, al));
        print(insert(l, al, true));
    }

}
