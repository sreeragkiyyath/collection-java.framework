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
public class TestOjectList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<StudentBean> students = new ArrayList<StudentBean>();

        students.add(new StudentBean(21, "Mathew", "mathew@gmail.com"));
        students.add(new StudentBean(32, "Philip", "philip@gmail.com"));
        students.add(new StudentBean(41, "Simon", "simon@gmail.com"));
        students.add(new StudentBean(52, "Ann", "ann@gmail.com"));
        students.add(new StudentBean(52, "Ann", "ann@gmail.com"));
        students.add(new StudentBean(4, "John", "john@gmail.com"));

    //    System.out.println("Contains : " + students.contains(new StudentBean(5, "Ann", "ann@gmail.com")));
        //Collections.sort(students);
      Collections.sort(students, new EmailComparator());
        Iterator<StudentBean> iterator = students.iterator();
        while (iterator.hasNext()) {
            StudentBean next = iterator.next();
            System.out.println(next);

        }

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
    }

}
