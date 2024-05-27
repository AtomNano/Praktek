/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luthfi_16mei;

/**
 *
 * @author luthf
 */
public class relationExample {
    public static void main(String[] args) {
        persegipanjang persegi = new persegipanjang();
        
        // Set the length and width of the rectangle
        persegi.setPanjangLebar(5, 3);
        
        // Calculate and display the area
        int luas = persegi.getLuas();
        System.out.println("Luas Persegi Panjang: " + luas);
        
        // Calculate and display the perimeter
        int keliling = persegi.getKeliling();
        System.out.println("Keliling Persegi Panjang: " + keliling);
        
        // Get the name from the interface
        String name = persegi.getName();
        System.out.println("Nama: " + name);
    }
}
