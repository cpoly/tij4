/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package innerclasses.exercises.ex6.concrete;

import innerclasses.exercises.ex6.contract.*;

/**
 *
 * @author cpolychronopoulos
 */
public class Parser
{
    protected class GS1Parser implements IParser
    {
        @Override
        public void parse() { System.out.println("GS1 Parser"); }
    }
    
    public IParser getParser()
    {
        return new GS1Parser();
    }
}