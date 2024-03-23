/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory1;

/**
 *
 * @author luthf
 */
public class product {
    private int itemnumber;
    private String name;
    private int quantityinstock;
    private double price;

    // Instance field declarations

    // Constraktor 1 - tampa parameter

    public product() {

    }
    
    // Constraktor 1 - tampa parameter
    public product(int number, String nama, int qty, double harga) {
        this.itemnumber = number;
        this.name = nama;
        this.quantityinstock = qty;
        this.price = harga;
    }


    //  method getter (accesor) untuk variabel item number
    public int getitemnumber() {
        return itemnumber;

    }

    // method mutator / setter utk itemnummber - update nilai 

    public void setitemnumber() {
        this.itemnumber = itemnumber;

    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int quantityinstock () {
        return quantityinstock;
    }

    public void setquantityinstock(int qyt) {
        this.quantityinstock = qyt;
    }
    
    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return  "\n\n Nama Produk  :"+this.itemnumber+
                "\n Nama Produk  :"+this.name+
                "\n Stock produk :"+this.quantityinstock+
                "\n Harga Produk :"+this.price;
    }
    
}

