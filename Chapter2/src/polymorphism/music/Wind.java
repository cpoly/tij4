/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.music;

/**
 *
 * @author costantis
 */
///:~
//: polymorphism/music/Wind.java
// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
// Redefine interface method:

    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
