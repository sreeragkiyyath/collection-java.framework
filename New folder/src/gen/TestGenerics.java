/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gen;

/**
 *
 * @author ADMIN
 */
public class TestGenerics<K> {

    K param;

    public void set(K param) {
        this.param = param;
    }

    public K get() {
        return param;
    }
    
    public  void showPram(){
        System.out.println(param);
    }
}
