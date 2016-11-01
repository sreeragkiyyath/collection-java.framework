/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class TestSetStirng {

    public static void main(String[] args) {
        TreeSet<String> hashSet = new TreeSet<String>();

        hashSet.add("D");
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");

        for (String a : hashSet) {
            System.out.println(a);
        }
    }

}
