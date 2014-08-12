/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holding.exercises.ex1;

import java.util.ArrayList;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i=0;i<=10;i++)
            gerbils.add(new Gerbil(i));
        for (Gerbil g: gerbils)
            g.hop();
    }
}

class Gerbil {
    
    int gerbilNumber;

    Gerbil(int num) {
        gerbilNumber = num;
    }
    
    void hop()
    {
        System.out.println("Hopping gerbil no. " + gerbilNumber);
    }
}

