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
public class Cleanup {

    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
; // Perform line-by-line processing here...
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
} /* Output:
 dispose() successful
 *///:~
