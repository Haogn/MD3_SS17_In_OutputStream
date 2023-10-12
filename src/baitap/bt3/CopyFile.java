package baitap.bt3;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File source = new File("baitap/bt3/source.txt");
        File target  = new File("baitap/bt3/target.txt") ;
        // ghi du lieu
        FileOutputStream out = null ;
        ObjectOutputStream outputStream = null ;
        // doc du lieu
        FileInputStream in = null ;
        ObjectInputStream inputStream = null ;

        try {
            target.createNewFile();
            in = new  FileInputStream(source) ;
            inputStream = new ObjectInputStream(in) ;

            ObjectInputStream inputStreamCopy = new ObjectInputStream(inputStream);
            Object copy = inputStreamCopy.readObject();
            inputStreamCopy.close();

            out = new FileOutputStream(target);
            ObjectOutputStream outputStreamCopy = new ObjectOutputStream(out);
            outputStreamCopy.writeObject(copy);
            outputStreamCopy.close();
            System.out.println("Coopy Thanh cong");

        } catch (IOException e) {
            System.out.println("Loi khi them moi File");
        } catch (ClassNotFoundException e) {
            System.out.println("Khong tim thay file");
        }
    }
}
