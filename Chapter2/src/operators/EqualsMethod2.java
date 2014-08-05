/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author cpolychronopoulos
 */
//: operators/EqualsMethod2.java
// Default equals() does not compare contents.
class Value {

    int i;
    
//    public boolean equals(Value v)
//    {
//        return this.i == v.i;
//    }
}

public class EqualsMethod2 {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
} /* Output:
 false
 *///:~
