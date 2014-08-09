/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package initialization.exercises.ex19;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise19 {
    void PrintAll(String... args)
    {
        for(String s: args)
            System.out.println(s);
    }
    
    public static void main(String[] args) {
        new Exercise19().PrintAll("one", "two", "three");
        new Exercise19().PrintAll(new String[] { "one", "two", "three"});
    }
}
