/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package initialization.exercises.ex16;

/**
 *
 * @author cpolychronopoulos
 */
public class ArrayOfStrings {
    String[] babyCount = new String[] { "one", "two", "three"};
    
    void print()
    {
        for (String s: babyCount)
            System.out.println(s);
    }
    
    public static void main(String[] args) {
        new ArrayOfStrings().print();
    }
}
