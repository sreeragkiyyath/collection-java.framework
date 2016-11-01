/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author ADMIN
 */
public class TestStringList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        ArrayList<String> students = new ArrayList<String>();
        students.add("Harris");
        students.add("Jude");
        students.add("Mathew");
        students.add("John");
        System.out.println("Contains : " + students.contains("John"));    
        
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
         */

 /*
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        
        String data = "Antony,Augustin,Joseph,John";
        String[] split = data.split(",");
        for (String s : split ){
            if(!students.contains(s)){
                students.add(s);
            }
        }
         */

 /* 
       LinkedList<String> students2 = new LinkedList<String>();
        students2.add("Harris");
        students2.add("Jude");
        students2.add("Mathew");
        students2.add("John");
         students.addAll(students2);
         
         */
        //  students.remove(1);
        //   students.remove("Harris");
        ArrayList<String> students = new ArrayList<String>();

        students.add("Jude");
        students.add("Harris");
        students.add("John");
        students.add("Mathew");
        students.add("Ann");

        System.out.println("Contains : " + students.contains("John"));
        Collections.sort(students);
        Iterator iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
       
       
    }

}
