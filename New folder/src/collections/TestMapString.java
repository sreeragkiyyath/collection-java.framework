/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public class TestMapString {

    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("1", "Harris");
        names.put("6", "Harris");
        names.put("2", "Sujith");
        names.put("3", "Antony");
        names.put("4", "Ashraf");
        names.put("5", "Akhil");
        
        System.out.println(names.keySet().getClass().getName());
        
        Iterator<String> iterator = names.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            
       //     System.out.println(names.get(key));
            
        }
        
        for(Map.Entry e : names.entrySet()){
            System.out.println(e.getValue());
        }
        
/*
        Hashtable<String, String> names = new Hashtable<>();
        names.put("1", "Harris");
        names.put("2", "Sujith");
        names.put("3", "Antony");
        names.put("4", "Ashraf");
        names.put("5", "Akhil");

        Collection<String> values = names.values();
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        
        */
      /*  System.out.println(names.keySet().getClass().getName());

        Iterator<String> iterator = names.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();

            System.out.println(names.get(key));

        }

        for (Map.Entry e : names.entrySet()) {
            System.out.println(e.getValue());
        }
*/
        
        /*
        LinkedHashMap<String, String> names = new LinkedHashMap<>();
        names.put("1", "Harris");
        names.put("6", "Harris");
        names.put("2", "Sujith");
        names.put("3", "Antony");
        names.put("4", "Ashraf");
        names.put("5", "Akhil");

        System.out.println(names.keySet().getClass().getName());

        Iterator<String> iterator = names.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();

            System.out.println(names.get(key));

        }
        System.out.println("-----------------------------");
        
        for (Map.Entry e : names.entrySet()) {
            System.out.println(e.getValue());
        }
         */
    }

}
