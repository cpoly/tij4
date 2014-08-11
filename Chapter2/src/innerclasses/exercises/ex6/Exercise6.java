/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package innerclasses.exercises.ex6;

import innerclasses.exercises.ex6.concrete.*;
import innerclasses.exercises.ex6.contract.*;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise6 extends Parser {
    
    public static IParser parse()
    {
       Parser p = new Parser();
       return p.getParser();
    }
    public static void main(String[] args) {
        IParser p = parse();
        p.parse();
    }
}

