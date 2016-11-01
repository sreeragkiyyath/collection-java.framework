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
public class EmailComparator implements Comparator<StudentBean>{

    @Override
    public int compare(StudentBean o1, StudentBean o2) {
//        int compare = -1; 
//       if(o1.getEmail().equals(o2.getEmail()) ){
//           compare = 1;
//       }
        return o1.getEmail().compareTo(o2.getEmail());
        //return compare;
    }
    
}
