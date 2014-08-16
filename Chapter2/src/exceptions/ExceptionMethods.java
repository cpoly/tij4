/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author costa_000
 */
public class ExceptionMethods {

    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.out.println("getMessage():" + e.getMessage());
            System.out.println("getLocalizedMessage():"
                    + e.getLocalizedMessage());
            System.out.println("toString():" + e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
} /* Output:
 Caught Exception
 getMessage():My Exception
 getLocalizedMessage():My Exception
 toString():java.lang.Exception: My Exception
 printStackTrace():
 java.lang.Exception: My Exception
 at ExceptionMethods.main(ExceptionMethods.java:8)
 *///:~
