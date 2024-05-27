// File BalokTester.java
package luthfi_balok;

import java.util.Scanner;

public class baloktester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang balok:");
        double panjang = scanner.nextDouble();

        System.out.println("Masukkan lebar balok:");
        double lebar = scanner.nextDouble();

        System.out.println("Masukkan tinggi balok:");
        double tinggi = scanner.nextDouble();

        // Membuat objek balok dari kelas Balok
        balok balok = new balok(panjang, lebar, tinggi);

        // Menampilkan volume dan luas permukaan balok
        System.out.println("Volume balok: " + balok.hitungVolume());
        System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());

        // Tutup scanner
        scanner.close();
    }
}
