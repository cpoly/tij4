/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strings.exercise.ex7;

/**
 *
 * @author costa_000
 */

import java.util.regex.*;

public class Exercise7 {
    static final String singleNo = "This is a single-line sentence.. ";
    static final String singleNo1 = " This is a single-line sentence.";
    static final String singleYes = "This is a single-line sentence.";
    static final String multiNo = " This is a\\n multi-line sentence. ";
    static final String multiYes = "This is a\\n multi-line sentence.";
    static final Pattern sentence = Pattern.compile("^[A-Z].+[^\\.]\\. ?$");
    
    public static void main(String[] args) {    
        System.out.println("singleNo: " + singleNo + sentence.matcher(singleNo).matches());
        System.out.println("singleNo1: " + singleNo1 + sentence.matcher(singleNo1).matches());
        System.out.println("singleYes: " + singleYes + sentence.matcher(singleYes).matches());
        System.out.println("multiNo: " + multiNo +sentence.matcher(multiNo).matches());
        System.out.println("multiYes: " + multiYes + sentence.matcher(multiYes).matches());
    }
}
