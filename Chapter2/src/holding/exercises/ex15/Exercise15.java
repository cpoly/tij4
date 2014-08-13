/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holding.exercises.ex15;

import java.util.*;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise15 {
    
    final static String exp = "+U+n+c--+e+r+t--+a-+i-+n+t+y--+-+r+u--+l+e+s--";
    public static void main(String[] args) {
        String ret = evaluate(exp);
        System.out.println("ret = " + ret);
    }

    private static String evaluate(String exp) {
        ArrayDeque<Character> stack = new ArrayDeque();
        char[] expArr = exp.toCharArray();
        String ret = "";
        for (int i = 0 ; i < expArr.length ; i++) {
            switch(expArr[i])
            {
                case '+': stack.push(expArr[++i]); break;
                case '-': ret += stack.pop(); break;
            }
        }
        return ret;
    }
}


