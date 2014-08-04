/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//: object/HelloDate.java
package object;

import java.util.*;

/**
 * The first Thinking in Java example program. Displays a string and today’s
 * date.
 *
 * @author costantis
 * @author Home Business Inc.
 * @version 4.0
 */
public class HelloDate {

    /**
     * Entry point to class & application.
     *
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.print("Hello, it’s : ");
        System.out.println(new Date());
    }
} /* Output: (55% match)
 Hello, it’s:
 Wed Oct 05 14:39:36 MDT 2005
 *///:~
