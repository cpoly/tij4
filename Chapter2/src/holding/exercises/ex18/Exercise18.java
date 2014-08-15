/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holding.exercises.ex18;

import java.util.*;

/**
 *
 * @author costa_000
 */
public class Exercise18 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("Tania", "Sanna");
        map.put("Costas", "Poly");
        map.put("Yiorenia", "Dret");
        TreeMap<String, String> tMap = new TreeMap(map);
        LinkedHashMap<String, String> lMap = new LinkedHashMap(tMap);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String string = entry.getKey();
            String string1 = entry.getValue();
        }
        System.out.println(map);
        System.out.println(tMap);
        System.out.println(lMap);       
        
    }
}
