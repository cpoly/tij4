/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses.exercises.ex23;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise23 {

    public static void main(String[] args) {
        A[] groupOfA = {new A(), new A(), new A() };
        B aB = new B();
        for (A anA : groupOfA) {
            aB.add(anA.makeU());
        }
//        aB.arrayOfU[1].this ();
        aB.nullify(2);
                
    }
}

interface U {

    void U1();

    void U2();

    void U3();
}

class A {

    public U makeU() {
        return new U() {

            @Override
            public void U1() {
                System.out.println("In U1");
            }

            @Override
            public void U2() {
                System.out.println("In U2");
            }

            @Override
            public void U3() {
                System.out.println("In U3");
            }
        };
    }

}

class B {

    U[] arrayOfU = new U[10];
    int uPointer = -1;

    void add(U aU) {
        if (++uPointer < arrayOfU.length) {
            arrayOfU[uPointer++] = aU;
        } else {
            System.out.println("Array is full.");
        }
    }

    void nullify(int position) {
        if (position >= 0 && position < arrayOfU.length) {
            arrayOfU[position] = null;
        } else {
            System.out.println("Non-existent U.");
        }
    }

    void callUmethods() {
        for (U aU : arrayOfU) {
            aU.U1();
            aU.U2();
            aU.U3();
        }

    }
}
