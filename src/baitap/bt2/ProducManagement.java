package baitap.bt2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProducManagement {
    public static Scanner sc = new Scanner(System.in) ;
    public static File fileTxt = new File("Product.txt");
    public static File fileDat = new File("Product.dat");
    public static FileWriter writer = null ;
    public static FileOutputStream out = null ;
    public static ObjectOutputStream outputStream = null;
    public static FileInputStream in = null ;
    public static ObjectInputStream inputStream = null ;
    public static List<Product> productList = new ArrayList<>();


    public static void main(String[] args) {

        int choice ;
        do {
            System.out.println("______ ProductManagement _______");
            System.out.println("1. Them san pham ");
            System.out.println("2. Hien thi san pham");
            System.out.println("3. Tim kiem san pham theo ten ");
            System.out.println("4. Thoat ");
            choice = Integer.parseInt(sc.nextLine()) ;
            switch (choice) {
                case 1 :
                    createProduct();
                    break;
                case 2 :
                    printProduct();
                    break;
                case 3 :
                    searchByName();
                    break;
                case 4 :
                    System.out.println("Thoat khoi chuong trinh");
                    sc.close();
                    break;
                default:
                    System.err.println("Lua chon khong phu hop , vui long chon lai ");
            }
        } while (choice != 4);

    }

    public static void createProduct() {
        System.out.println("Nhap so luong san pham muon them vao danh sach");
        int n = Integer.parseInt(sc.nextLine()) ;
        for (int i = 0; i < n; i++) {
            Product newProduct = new Product() ;
            newProduct.inputData();
            productList.add(newProduct);
        }
       try {
           System.out.println("Them moi File thanh cong");
           out = new FileOutputStream(fileDat);
           outputStream = new ObjectOutputStream(out) ;
           outputStream.writeObject(productList);
           outputStream.close();
           System.out.println("Ghi File thanh cong");
       } catch (IOException e) {
           System.out.println("Loi khi ghi File");;
       }
    }

    public static void printProduct() {
        try {
            in = new FileInputStream(fileDat) ;
            inputStream = new ObjectInputStream(in) ;
            List<Product> products =(List<Product>) inputStream.readObject();
            for (Product product : products) {
                product.display();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file ");
        } catch (IOException e) {
            System.out.println("Co loi khi doc file ");
        } catch (ClassNotFoundException e) {
            System.out.println("Khong tim thay doi tuong ");
        }
    }

    public static void searchByName() {
        try {
            in = new FileInputStream(fileDat) ;
            inputStream = new ObjectInputStream(in) ;
            List<Product> products = (List<Product>) inputStream.readObject();
            System.out.println("Nhap vao ten san pham can tim kiem");
            String name = sc.nextLine();
            boolean isExit = false ;
            for (Product product : products) {
                if ( product.getNameProduct().trim().equals(name)) {
                    System.out.println("San hien co trong danh sach");
                    product.display();
                    isExit = true;
                }
            }
            if (!isExit) {
                System.out.println("Khong tim thay san pham trong danh sach");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file ");
        } catch (IOException e) {
            System.out.println("Co loi khi doc file ");
        } catch (ClassNotFoundException e) {
            System.out.println("Khong tim thay doi tuong");
        }
    }
}
