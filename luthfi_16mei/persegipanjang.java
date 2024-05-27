/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luthfi_16mei;

/**
 *
 * @author luthf
 */
public class persegipanjang implements relation {
    
    private int panjang;
    private int lebar;
    
    public persegipanjang() {
        
    }
    
    public persegipanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public String getName() {
        return "Luas dan Keliling Persegi Panjang";
    }
    
    public int getLuas() {
        return panjang * lebar;
    }
    
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
    
    public void setPanjangLebar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
}

