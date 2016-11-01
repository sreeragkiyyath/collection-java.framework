/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author ADMIN
 */
public class TestObjectQueue {

    public static void main(String[] args) {
        
        
        PriorityQueue<StudentBean> queue = new PriorityQueue<>();
        queue.add(new StudentBean(10,"Harris", "harris@gmail.com"));
        queue.add(new StudentBean(31,"Jude", "jude@gmail.com"));
        queue.add(new StudentBean(13,"Justin", "justin@gmail.com"));
        queue.add(new StudentBean(14,"Angel", "angel@gmail.com"));
        queue.add(new StudentBean(14,"Anto", "anto@gmail.com"));
        
        System.out.println(queue.poll());
       
        Iterator<StudentBean> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        /*
        ArrayDeque<StudentBean> queue = new ArrayDeque<>();
        queue.add(new StudentBean(10,"Harris", "harris@gmail.com"));
        queue.add(new StudentBean(31,"Jude", "jude@gmail.com"));
        queue.add(new StudentBean(13,"Justin", "justin@gmail.com"));
        queue.add(new StudentBean(14,"Angel", "angel@gmail.com"));
        queue.add(new StudentBean(14,"Anto", "anto@gmail.com"));
        
        System.out.println(queue.pollLast());
        
        Iterator<StudentBean> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
*/

    }

}
