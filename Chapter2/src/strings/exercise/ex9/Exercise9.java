/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strings.exercise.ex9;

import java.util.regex.Pattern;

/**
 *
 * @author costa_000
 */
public class Exercise9 {
    static final String KNIGHTS = "Then, when you have found the shrubbery, you must " +
                                    "cut down the mightiest tree in the forest... " +
                                    "with... a herring!";
    static final Pattern vowels = Pattern.compile("[aeiouyAEIOUY]");
    public static void main(String[] args) {
        System.out.println(vowels.matcher(KNIGHTS).replaceAll("_"));
    }
}
