/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luthfi17mei;

/**
 *
 * @author luthf
 */
public class DivByZero {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
            System.out.println("Cetak :");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
