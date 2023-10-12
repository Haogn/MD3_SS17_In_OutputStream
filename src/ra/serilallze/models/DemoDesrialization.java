package ra.serilallze.models;

import ra.serilallze.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DemoDesrialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Doc tu file Student.obj");
        FileInputStream fileInputStream = null;
        ObjectInputStream inputStream = null ;
    try {
        fileInputStream = new FileInputStream("Student.dat") ;
        inputStream = new ObjectInputStream(fileInputStream);

    } catch (Exception e) {

    } finally {
        if (fileInputStream != null) {
            fileInputStream.close();
        }

        if (inputStream != null) {
            inputStream.close();
        }
    }
    }
}
