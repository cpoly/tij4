/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author costa_000
 */
//: arrays/MultidimensionalPrimitiveArray.java
// Creating multidimensional arrays.
import java.util.*;

public class MultidimensionalPrimitiveArray {

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3,},
            {4, 5, 6,},};
        System.out.println(Arrays.deepToString(a));
    }
} /* Output:
 [[1, 2, 3], [4, 5, 6]]
 *///:~
