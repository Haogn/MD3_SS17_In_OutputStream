package baitap.bt1;

import java.io.Serializable;

public class User implements Serializable {
    private int id ;
    private String nameUser ;
    private String password ;
    private boolean status ;

    public User() {

    }

    public User(int id, String nameUser, String password, boolean status) {
        this.id = id;
        this.nameUser = nameUser;
        this.password = password;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nameUser='" + nameUser + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }

    public void display() {
        System.out.println("Id: " +id+" | name: "+" | password: "+password+" | status: "+status);
    }
}
