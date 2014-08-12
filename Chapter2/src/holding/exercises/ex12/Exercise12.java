/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holding.exercises.ex12;

import java.util.*;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise12 implements Inverter 
{
    List<Integer> obs;
    List<Integer> revObs;
    
    public Exercise12() {
        this.obs = new ArrayList<>((Arrays.asList(1,2,3,4,5,6,7)));
        this.revObs = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Exercise12 ex12 = new Exercise12();
        ListIterator liObs = ex12.obs.listIterator();
        ListIterator lirevObs = ex12.revObs.listIterator();
        
        ex12.invertObservations(liObs, lirevObs);
        System.out.println("Initial sequence: " + ex12.obs);
        System.out.println("After inversion sequence: " + ex12.revObs);
    }

    private void invertObservations(ListIterator<Integer> liObs,
            ListIterator<Integer> lirevObs) {
//        while(liObs.hasNext())
//        {
//            lirevObs.previous();
//            lirevObs.set(liObs.next());
//        }
        Stack<Integer> temp = new Stack();
        while(liObs.hasNext())
            temp.push(liObs.next());
        while(!temp.empty())
        {
            lirevObs.add(temp.pop());
        }
            
    }
}
