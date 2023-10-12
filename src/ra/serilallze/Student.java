package ra.serilallze;

import java.io.Serializable;

public class Student implements Serializable {
    private int id ;
    private String name ;

    private int age ;
    private boolean gender ;
    public Student() {

    }

    public Student(int id, String name, int age, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayData() {
        System.out.println("Id: " + id + " | name: " + name + " | age : " + age + " | gender: " + (gender?"Nam":"Nu"));
    }
}
