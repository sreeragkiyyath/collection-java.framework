/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class IdComparator implements Comparator<StudentBean> {

    @Override
    public int compare(StudentBean o1, StudentBean o2) {
       int compare = -1; 
       if(o1.getId() > o2.getId()){
           compare = 1;
       }
       return compare;
    }

}
