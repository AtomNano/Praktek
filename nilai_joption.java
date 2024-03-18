// Nama : Muhammad Luthfi Naldi
// Nim : 2301092025

package luthfi_14_maret.latihan;

import javax.swing.JOptionPane;

public class nilai_joption {
    public static void main(String[] args) {
        int total = 0;
        int nilai;

        for (int i = 1; i <= 3; i++) {
            nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai ujian ke-" + i + ":"));
            total += nilai;
        }

        double rataRata = total / 3.0;
        JOptionPane.showMessageDialog(null,
                "Nilai rata-rata dari tiga ujian adalah: " + rataRata + "\n" + (rataRata >= 60 ? ":-)" : ":-("));
        
    }
}

