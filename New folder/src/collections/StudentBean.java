/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author ADMIN
 */
public class StudentBean implements Comparable<StudentBean> {

    private int id;
    private String name;
    private String email;

    public StudentBean(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID : " + id + ", Name : " + name + ", Email : " + email;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equals = false;
        if (obj instanceof StudentBean) {
            if (((StudentBean) obj).id == this.id) {
                equals = true;
            }
        }
        return equals;
    }

    @Override
    public int hashCode() {
        return ("ID : " + id + ", Name : " + name + ", Email : " + email).hashCode();
    }

    @Override
    public int compareTo(StudentBean o) {
  //      System.out.println("called comare to");
        return name.compareTo(o.getName());
    }

}
