package ra.serilallze.models;

import ra.serilallze.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class DemoSerialozation  {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hoang", 25, true));
        students.add(new Student(2, "Nam", 30, true));

        File file = new File("Student.dat") ;
        if (file.createNewFile()) {
            System.out.println("Tao File thanh cong ");
            FileOutputStream fileOutputStream = new FileOutputStream(file) ;
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(students);
            System.out.println("Ghi File thanh cong");
        } else {
            System.err.println("Tao FIle khong thanh cong");;
        }
    }
}
