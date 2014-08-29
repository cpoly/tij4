/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.exercises.ex3;

/**
 *
 * @author costa_000
 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
import java.util.regex.Pattern;

public class Exercise3 {

    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        
        long totalBytes = 0;
        for (String dirItem : list) {
            System.out.println(dirItem);
            totalBytes += new File(dirItem).length();
        }
        System.out.format("Bytes used: %d\n", totalBytes);
    }
}

class DirFilter implements FilenameFilter {

    private final Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
} /* Output:
 DirectoryDemo.java
 DirList.java
 DirList2.java
 DirList3.java
 *///:~

