package baitap.bt1;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserialition {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        ObjectInputStream inputStream = null ;
        try {
            in = new FileInputStream("User.dat");
            inputStream = new ObjectInputStream(in) ;

            List<User> users = (List<User>) inputStream.readObject() ;
            for (User user : users) {
                user.display();
            }
        } catch (Exception e) {

        } finally {
            if (in != null ) {
                in.close();
            }

            if (inputStream !=  null) {
                inputStream.close();
            }
        }
    }
}
