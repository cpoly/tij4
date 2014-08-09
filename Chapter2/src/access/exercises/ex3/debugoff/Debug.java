/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package access.exercises.ex3.debugoff;

/**
 *
 * @author cpolychronopoulos
 */
public class Debug {
    public static void debug(String msg)
    {
//        System.out.println("msg = " + msg);
        System.err.println("msg = " + msg);
    }
}
