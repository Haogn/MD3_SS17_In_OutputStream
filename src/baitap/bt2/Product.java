package baitap.bt2;

import java.io.Serializable;
import static baitap.bt2.ProducManagement.*;

public class Product implements Serializable {
    private static int nextId = 1 ;
    private int id ;
    private String nameProduct ;
    private String title ;
    private String manufacturer ;
    private double price ;
    public Product() {
        this.id = nextId++ ;
    }

    public Product(int id, String nameProduct, String title, String manufacturer, double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.title = title;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Product.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", title='" + title + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", Price=" + price +
                '}';
    }

    public void inputData() {
        System.out.println("Nhap vao ten san pham ");
        this.nameProduct = sc.nextLine() ;
        System.out.println("Mo ta san pham ");
        this.title = sc.nextLine();
        System.out.println("Hang san pham ");
        this.manufacturer= sc.nextLine();
        System.out.println("Gia ban");
        this.price = Double.parseDouble(sc.nextLine()) ;
    }

    public void display() {
        System.out.println("Id: "+id+" | Ten san pham: "+nameProduct+" | Mo ta: "+title+" | Hang "+manufacturer+" | Gia ban: "+price);
    }
}
