/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holding.exercises.ex3;

import java.util.*;

/**
 *
 * @author cpolychronopoulos
 */
public class Generator {

    final String[] series = {"Game of Thrones", "Lord of the Rings", "Breaking Bad"};
    static int counter = 0;

    String[] ar = new String[10];
    Collection<String> arList = new ArrayList<>();
    Collection<String> lList = new LinkedList<>();
    Collection<String> hSet = new HashSet<>();
    Collection<String> lhSet = new LinkedHashSet<>();
    Collection<String> tSet = new TreeSet<>();

    String next() {
        return series[counter++ % series.length];
    }

    public static void main(String[] args) {
        Generator gen = new Generator();
        for (int i = 0; i <= gen.ar.length; i++) {
            String toAdd = gen.next();
            gen.arList.add(toAdd);
            gen.lList.add(toAdd);
            gen.hSet.add(toAdd);
            gen.lhSet.add(toAdd);
            gen.tSet.add(toAdd);
        }

        System.out.println("ArrayList: " + gen.arList);
        System.out.println("LinkedList: " + gen.lList);
        System.out.println("HashSet: " + gen.hSet);
        System.out.println("LinkedHashSet: " + gen.lhSet);
        System.out.println("TreeSet: " + gen.tSet);
    }
}
