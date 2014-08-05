/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package initialization.exercises.ex12;

/**
 *
 * @author cpolychronopoulos
 */
public class Tank {
    boolean empty = false;
    String name;
    
    Tank(String name)
    {
        this.name = name;
    }
    
    void empty()
    {
        empty = true;
    }
    
    protected void finalize()
    {
        if (!this.empty)
        {
            empty();
            System.out.println(name + " was not empty! Now it is...");
        }
            
    }
    
    public static void main(String[] args) {
        Tank t1 = new Tank("Tank1");
        t1.empty();
        Tank t2 = new Tank("Tank2");
        System.gc();
    }
    
}
