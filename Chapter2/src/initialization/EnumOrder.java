/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialization;

/**
 *
 * @author cpolychronopoulos
 */
public class EnumOrder {

    public enum Spiciness {

        NOT, MILD, MEDIUM, HOT, FLAMING
    }

    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal = " + s.ordinal());
        }
    }
}
