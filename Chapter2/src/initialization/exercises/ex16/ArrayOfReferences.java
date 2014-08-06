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
public class ArrayOfReferences {
    ArrayOfReferences(String arg)
    {
        System.out.println("arg = " + arg);
    }
    
    public static void main(String[] args) {
        ArrayOfReferences[] refs = new ArrayOfReferences[10];
//        ArrayOfReferences[] refs = new ArrayOfReferences[] { new ArrayOfReferences("one")};
    }
}
