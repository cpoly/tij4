/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers.exercises.ex40;

/**
 *
 * @author costa_000
 */
import java.util.*;

public class Exerise40 {

    public static void main(String[] args) {
        TwoStrings[] uno = new TwoStrings[]{new TwoStrings("one", "two"),
            new TwoStrings("three", "four"),
            new TwoStrings("five", "six")};
        System.out.println(Arrays.toString(uno));

        Arrays.sort(uno);

        System.out.println(Arrays.toString(uno));
        
        Arrays.sort(uno, new TwoStringComparator());
        
        System.out.println(Arrays.toString(uno));
    }
}

class TwoStringComparator implements Comparator<TwoStrings> {

    @Override
    public int compare(TwoStrings o1, TwoStrings o2) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        String name = o1.getClass().getSimpleName();
        String argFirst = o2.getClass().getSimpleName();
        int firstCompare = name.compareTo(argFirst);
        if (firstCompare != EQUAL) {
            return firstCompare;
        }
        if (o1.second != null && o2.second != null) {
            int secondCompare = o1.second.compareTo(o2.second);
            if (secondCompare != EQUAL) {
                return secondCompare;
            }
        }
        return BEFORE;
    }

}

class TwoStrings implements Comparable<TwoStrings> {

    String first;
    String second;

    TwoStrings(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(TwoStrings o) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        String name = getClass().getSimpleName();
        String argFirst = o.getClass().getSimpleName();
        int firstCompare = name.compareTo(argFirst);
        if (firstCompare != EQUAL) {
            return firstCompare;
        }
        if (this.first != null && o.first != null) {
            int secondCompare = this.first.compareTo(o.first);
            if (secondCompare != EQUAL) {
                return secondCompare;
            }
        }
        return BEFORE;
    }

    @Override
    public String toString() {
        return this.first + "-" + this.second;
    }
}
