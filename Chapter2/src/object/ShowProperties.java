/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//: object/ShowProperties.java

package object;

/**
 *
 * @author costantis
 */
public class ShowProperties {
    
    public static void main(String[] args)
    {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
    
} ///:~
