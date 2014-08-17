/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author costa_000
 */
//: strings/SimpleFormat.java
public class SimpleFormat {

    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
// The old way:
        System.out.println("Row 1: [" + x + " " + y + "]");
// The new way:
        System.out.format("Row 1: [%d %f]\n", x, y);
// or
        System.out.printf("Row 1: [%d %f]\n", x, y);
    }
} /* Output:
 Row 1: [5 5.332542]
 Row 1: [5 5.332542]
 Row 1: [5 5.332542]
 *///:~
