/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holding;

import java.util.Stack;

/**
 *
 * @author cpolychronopoulos
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while(!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
