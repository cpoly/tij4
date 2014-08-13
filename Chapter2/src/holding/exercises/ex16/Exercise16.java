/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holding.exercises.ex16;

import java.util.*;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise16 {

    Set<String> words = new TreeSet(String.CASE_INSENSITIVE_ORDER) ;
    words.addAll(Arrays.asList("A", "B", "C", "Collections", "D", 
                            "E", "F", "G", "H", "HashSet", "I", "J", "K",
                            "L", "M", "N", "Output", "Print", "Set", "SetOperations",
                            "String", "X", "Y", "Z", "add", "addAll", "added"));
    Set<Character> vowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u');
    public static void main(String[] args) {
        Set<Character> vowelsInWords = new HashSet();
        vowelsInWords = words.retainAll(vowels);
    }
}

//: holding/UniqueWords.java
class UniqueWords {

} /* Output:
 [A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
 *///:~
