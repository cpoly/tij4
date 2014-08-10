/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.exercises.ex19;

/**
 *
 * @author costantis
 */
public class Exercise19 {

    public static void main(String[] args) {
        tossThing(new DiceTossing());
        tossThing(new CoinTossing());
    }

    public static void tossThing(Tossing t) {
        t.toss();
    }
}

interface Tossing {

    void toss();
}

class DiceTossing implements Tossing {

    @Override
    public void toss() {
        System.out.println("Dice tossing");
    }
}

class CoinTossing implements Tossing {

    @Override
    public void toss() {
        System.out.println("Coin tossing");
    }
}
