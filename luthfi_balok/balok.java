// File Balok.java
package luthfi_balok;

public class balok {
    private double panjang;
    private double lebar;
    private double tinggi;

    // Konstruktor kelas Balok
    public balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Metode untuk menghitung volume balok
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Metode untuk menghitung luas permukaan balok
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + lebar * tinggi + tinggi * panjang);
    }

    String cariVolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
