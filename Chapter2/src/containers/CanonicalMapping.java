/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author costa_000
 */
//: containers/CanonicalMapping.java
// Demonstrates WeakHashMap.
import java.util.*;

class Element {

    private String ident;

    public Element(String id) {
        ident = id;
    }

    public String toString() {
        return ident;
    }

    public int hashCode() {
        return ident.hashCode();
    }

    public boolean equals(Object r) {
        return r instanceof Element
                && ident.equals(((Element) r).ident);
    }

    protected void finalize() {
        System.out.println("Finalizing "
                + getClass().getSimpleName() + " " + ident);
    }
}

class Key extends Element {

    public Key(String id) {
        super(id);
    }
}

class Value extends Element {

    public Value(String id) {
        super(id);
    }
}

public class CanonicalMapping {

    public static void main(String[] args) {
        int size = 1000;
// Or, choose size via the command line:
        if (args.length > 0) {
            size = new Integer(args[0]);
        }
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> map = new WeakHashMap<>();
        for (int i = 0; i < size; i++) {
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));
            if (i % 3 == 0) {
                keys[i] = k; // Save as "real" references
            }
            map.put(k, v);
        }
        System.gc();
    }
} /* (Execute to see output) *///:~
