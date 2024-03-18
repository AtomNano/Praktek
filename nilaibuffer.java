// Nama : Muhammad Luthfi Naldi
// Nim : 2301092025

package luthfi_14_maret.latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nilaibuffer {
    public static void main(String[] args)throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int nilai;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan nilai ujian ke-" + i + ": ");
            nilai = Integer.parseInt(reader.readLine());
            total += nilai;
        }

        double rataRata = total / 3.0;
        System.out.println("Nilai rata-rata dari tiga ujian adalah: " + rataRata);
        System.out.println(rataRata >= 60 ? ":-)" : ":-(");
        
    }
    }
    
