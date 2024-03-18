// Nama : Muhammad Luthfi Naldi
// Nim : 2301092025

package luthfi_14_maret.latihan;

import java.util.Scanner;

public class membacabilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka (1-10): ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Satu");
        } else if (number == 2) {
            System.out.println("Dua");
        } else if (number == 3) {
            System.out.println("Tiga");
        } else if (number == 4) {
            System.out.println("Empat");
        } else if (number == 5) {
            System.out.println("Lima");
        } else if (number == 6) {
            System.out.println("Enam");
        } else if (number == 7) {
            System.out.println("Tujuh");
        } else if (number == 8) {
            System.out.println("Delapan");
        } else if (number == 9) {
            System.out.println("Sembilan");
        } else if (number == 10) {
            System.out.println("Sepuluh");
        } else {
            System.out.println("Invalid number");
        }
    }
}
