/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class TestSetObject {

    public static void main(String[] args) {
           /*HashSet<StudentBean> students = new HashSet<StudentBean>();

        students.add(new StudentBean(41, "Simon", "simon@gmail.com"));
        students.add(new StudentBean(21, "Mathew", "mathew@gmail.com"));
        students.add(new StudentBean(32, "Philip", "philip@gmail.com"));
        students.add(new StudentBean(32, "Philip", "philip@gmail.com"));
        students.add(new StudentBean(52, "Ann", "ann@gmail.com"));
        students.add(new StudentBean(4, "John", "john@gmail.com"));
        students.add(new StudentBean(4, "John", "john@gmail.com"));
        
        Iterator<StudentBean> iterator = students.iterator();
        while (iterator.hasNext()) {            
            System.out.println(iterator.next());
        }*/
      
        /*
  LinkedHashSet<StudentBean> students = new LinkedHashSet<StudentBean>();

        students.add(new StudentBean(21, "Mathew", "mathew@gmail.com"));
        students.add(new StudentBean(32, "Philip", "philip@gmail.com"));
        students.add(new StudentBean(41, "Simon", "simon@gmail.com"));
        students.add(new StudentBean(52, "Ann", "ann@gmail.com"));
        students.add(new StudentBean(4, "John", "john@gmail.com"));
        students.add(new StudentBean(4, "John", "john@gmail.com"));

        Iterator<StudentBean> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
         
        */
        
        
        TreeSet<StudentBean> students = new TreeSet<StudentBean>();

        students.add(new StudentBean(21, "Mathew", "mathew@gmail.com"));
        students.add(new StudentBean(32, "Philip", "philip@gmail.com"));
        students.add(new StudentBean(41, "Simon", "simon@gmail.com"));
        students.add(new StudentBean(52, "Ann", "zann@gmail.com"));
        students.add(new StudentBean(4, "John", "john@gmail.com"));
        students.add(new StudentBean(4, "John", "john@gmail.com"));

        Iterator<StudentBean> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
