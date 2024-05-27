/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luthfi17mei;

import java.util.InputMismatchException;

/**
 *
 * @author luthf
 */

import java.util.Scanner;

public class PembagianKosong {
    
    public static int bagi(int a, int b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Maaf anda belum pantas");
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan perasaan: ");
            int a = scanner.nextInt();
            System.out.print("Masukkan Keuangan: ");
            int b = scanner.nextInt();
            
            int result = bagi(a, b);
            System.out.println("Hasil = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Pesan Error: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Nilai yang anda Inputkan salah");
        } finally {
            System.out.println("Program exception berakhir");
        }
    }
}
