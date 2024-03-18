// Nama : Muhammad Luthfi Naldi
// Nim : 2301092025

package luthfi_14_maret.latihan;

import java.util.Scanner;

public class perpangkatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double base = scanner.nextDouble();
        System.out.print("Masukkan nilai pangkat: ");
        int exponent = scanner.nextInt();

        double result = 1;
        int i = 0;
        while (i < exponent) {
            result *= base;
            i++;
        }

        System.out.println("Hasil: " + result);

        System.out.println("========================================");
        System.out.println("========DO - WHILE LOOP=================");
    
        // Menggunakan do - while loop

        int q = scanner.nextInt();

        double p = 1;
        int a = 0;
        do {
            p *= base;
            a++;
        } while (a < q);

        System.out.println("Hasil: " + p);

        System.out.println("========================================");
        System.out.println("========FOR - LOOP=================");

        //  for loop

        int t = scanner.nextInt();

        double h = 1;
        for (int k = 0; k < t; k++) {
            h *= base;
        }

        System.out.println("Hasil: " + h);
    }
    
}
