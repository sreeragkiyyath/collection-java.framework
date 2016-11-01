/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author ADMIN
 */
public class TestProperties {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader("hello.txt");
        Properties p = new Properties();
        p.load(reader);
        
        System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
        Properties sp = System.getProperties();
        System.out.println(sp.getProperty("user.dir"));
    }

}
