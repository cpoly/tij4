/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holding.exercises.ex27;

import java.util.*;

/**
 *
 * @author costa_000
 */
public class Exercise27 {

    public static void main(String[] args) {
        Command[] commands = { new Command("print"), new Command("put"), new Command("peek") };
        Queue<Command> myQ = new LinkedList();
        Commander c = new Commander(myQ);
        myQ = c.fill(commands);
        while (myQ.peek() != null)
            myQ.remove().operation();
    }
}

class Command {

    String com;

    Command(String c)
    {
        this.com = c;
    }
    
    void operation() {
        System.out.println(com);
    }
}

class Commander {

    Queue<Command> qc;

    Commander(Queue q) {
        this.qc = q;
    }

    Queue fill(Command[] commands) {
        for (Command com : commands) {
            qc.offer(com);
        }
        return qc;
    }
}
