/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author costantis
 */
//: interfaces/Factories.java
interface Service {

    void method1();

    void method2();
}

interface ServiceFactory {

    Service getService();
}

class Implementation1 implements Service {

    Implementation1() {
    } // Package access

    public void method1() {
        System.out.println("Implementation1 method1");
    }

    public void method2() {
        System.out.println("Implementation1 method2");
    }
}

class Implementation1Factory implements ServiceFactory {

    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service {

    Implementation2() {
    } // Package access

    public void method1() {
        System.out.println("Implementation2 method1");
    }

    public void method2() {
        System.out.println("Implementation2 method2");
    }
}

class Implementation2Factory implements ServiceFactory {

    public Service getService() {
        return new Implementation2();
    }
}

public class Factories {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();

}
public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
// Implementations are completely interchangeable:
        serviceConsumer(new Implementation2Factory());
    }
} /* Output:
Implementation1 method1
Implementation1 method2
Implementation2 method1
Implementation2 method2
*///:~
