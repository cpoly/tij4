/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author costa_000
 */
public abstract class Test<C> {

    String name;

    public Test(String name) {
        this.name = name;
    }
// Override this method for different tests.
// Returns actual number of repetitions of test.

    abstract int test(C container, TestParam tp);
} ///:~
