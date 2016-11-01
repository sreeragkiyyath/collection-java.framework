/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author ADMIN
 */
public class TestStingQueue {

    public static void main(String[] args) {
        /*
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Harris");
        queue.add("Justin");
        queue.add("Jude");
        queue.add("Anoop");
        queue.add("Angel");
        System.out.println(queue.peek());
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
         */
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("Harris");
        queue.add("Justin");
        queue.add("Jude");
        queue.add("Anoop");
        queue.add("Angel"); 
        System.out.println(queue.pollLast());
        
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }

}
