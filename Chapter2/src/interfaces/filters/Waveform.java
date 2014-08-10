/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.filters;

/**
 *
 * @author costantis
 */
//: interfaces/filters/Waveform.java
public class Waveform {

    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }
} ///:~
