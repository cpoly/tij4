/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.exercises.ex16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.*;

/**
 *
 * @author costantis
 */
public class Exercise16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomCharsAdapter(new RandomChars(10)));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}

class RandomChars {

    private static Random rand = new Random(128);
    private byte[] chars;

    RandomChars(int max) {
        chars = new byte[max];
    }

    public char[] next() {
        rand.nextBytes(chars);
        return new String(chars).toCharArray();
    }
}

class RandomCharsAdapter implements Readable {

    RandomChars r;

    RandomCharsAdapter(RandomChars r) {
        this.r = r;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        char[] total = r.next();
        
        for (char c : total) {
            cb.append(c);
        }
        return -1;
    }

}
