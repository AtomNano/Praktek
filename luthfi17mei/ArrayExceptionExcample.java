/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luthfi17mei;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luthf
 */
public class ArrayExceptionExcample {
    public static void main(String[] args) {
    
        try {
            Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai Array = ");
        int uk = input.nextInt();
        // deklarasi Array
        int[] nilai = new int[uk];
        for (int i = 0; i < uk; i++) {
            System.out.println("NIlai array indeks ke" + i + " = ");
            nilai[i] = input.nextInt();
        }
        System.out.println("Indeks array yang akan ditampilkan = ");
        int index = input.nextInt();

        System.out.println("Nilai indeks ke " + index + " = " + nilai[index]);
        
        } catch (InputMismatchException e) {
            System.out.println("Data input tidak sesuai dengan tipe");
        } catch (NegativeArraySizeException e){
            System.out.println("Nilai array tidak boleh negatif");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nilai indeks array tidak boleh negatif");
        } finally {
            System.out.println("System Selesai");
        }
    }
}
