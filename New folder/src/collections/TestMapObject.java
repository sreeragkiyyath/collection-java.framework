/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
public class TestMapObject {

    public static void main(String[] args) {
        HashMap<String, StudentBean> names = new HashMap<>();
        names.put("1", new StudentBean(21, "Mathew", "mathew@gmail.com"));
        names.put("6", new StudentBean(32, "Philip", "philip@gmail.com"));
        names.put("2", new StudentBean(41, "Simon", "simon@gmail.com"));
        names.put("3", new StudentBean(52, "Ann", "ann@gmail.com"));
        names.put("4", new StudentBean(4, "John", "john@gmail.com"));
        
          for (Map.Entry e : names.entrySet()) {
            System.out.println(e.getValue());
        }
         
        Iterator<String> iterator = names.keySet().iterator();
        while(iterator.hasNext()){
        
            System.out.println(iterator.next());
        
        }
    }

}
