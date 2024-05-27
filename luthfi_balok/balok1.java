/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luthfi_balok;

/**
 *
 * @author luthf
 */
public class balok1 {
    private double panjang;
    private double lebar;
    private double tinggi;

public balok1 (double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + lebar * tinggi + tinggi * panjang);
    }

    // Fungsi untuk mencari volume balok
    public double cariVolume() {
        return hitungVolume();
    }
}