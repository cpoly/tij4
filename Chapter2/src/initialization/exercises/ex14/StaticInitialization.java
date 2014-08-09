/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package initialization.exercises.ex14;

/**
 *
 * @author cpolychronopoulos
 */
public class StaticInitialization {
    static String outer; //= "Outer";
    static String inner;
    
    static { inner = "Inner"; }
    
    StaticInitialization()
    {
        outer = "Outer";
    }
    
    static void print()
    {
        System.out.println("outer = " + outer);
        System.out.println("inner = " + inner);
           
    }
    public static void main(String[] args) {
        print();
    }
}
