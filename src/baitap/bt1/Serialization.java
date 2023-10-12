package baitap.bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialization {
    public static void main(String[] args) throws IOException {
        File file = new File("User.dat") ;
        File file1 = new File("User.txt") ;
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Hoang", "1234", true));
        list.add(new User(2, "Tam", "4567", true));
        list.add(new User(3, "Linh", "78910", true));
        FileOutputStream out = null;
        ObjectOutputStream outputStream = null;
        FileWriter fileWriter = new FileWriter(file1);
        for (User user : list) {
            fileWriter.write(user.toString() + "\n");
        }
        fileWriter.close();
        try {
            System.out.println("Them moi file thanh cong ");
          out = new FileOutputStream(file);
          outputStream = new ObjectOutputStream(out) ;
          outputStream.writeObject(list);
            System.out.println("Ghi File thanh cong");
        } catch (Exception e) {

        }finally {
            if (out != null) {
                out.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
