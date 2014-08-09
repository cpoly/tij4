/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.exercises.ex16;

/**
 *
 * @author costantis
 */
class AlertStatus {

    String color;

    @Override
    public String toString() {
        return color;
    }
}

class RedAlert extends AlertStatus {

    RedAlert() {
        color = "Red";
    }
}

class GreenAlert extends AlertStatus {

    GreenAlert() {
        color = "Green";
    }
}

class Starship {

    AlertStatus alert = new RedAlert();

    Starship() {
        System.out.println("New Starship. Alert = " + alert);
    }

    public void change(AlertStatus newStatus) {
        alert = newStatus;
    }
}

public class Exercise16 {

    public static void main(String[] args) {
        Starship ship = new Starship();
        System.out.println(ship.alert);
        ship.change(new GreenAlert());
        System.out.println(ship.alert);
        ship.change(new RedAlert());
        System.out.println(ship.alert);
    }

}
