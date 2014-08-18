/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author costa_000
 */
//: strings/ReFlags.java
import java.util.regex.*;

public class RegFlags {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java",
                Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(
                "java has regex\nJava has regex\n"
                + "JAVA has pretty good regular expressions\n"
                + "Regular expressions are in Java");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
} /* Output:
 java
 Java
 JAVA
 *///:~
