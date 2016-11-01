/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gen;

import collections.StudentBean;

/**
 *
 * @author ADMIN
 */
public class Tester {
    
    public static void main(String[] args) {
        TestGenerics<String> name = new TestGenerics<>();
        name.set("harris");
        name.showPram();
        TestGenerics<StudentBean> student = new TestGenerics<>();
        student.set(new StudentBean(10, "jude", "jude@gmail.com"));
        student.showPram();
        TestGenerics<Integer> id = new TestGenerics<>();
        id.set(10);
        id.showPram();
        
    }
    
    
}
