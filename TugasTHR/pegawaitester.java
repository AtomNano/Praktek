package TugasTHR;

import java.util.Scanner;

public class pegawaitester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyaknya pegawai: ");
        int jumlah = 0;
        boolean inputValid = false;

        // Validasi input jumlah pegawai
        while (!inputValid) {
            if (scanner.hasNextInt()) {
                jumlah = scanner.nextInt();
                if (jumlah > 0) {
                    inputValid = true;
                } else {
                    System.out.println("Input tidak valid. Masukkan angka lebih dari 0.");
                    System.out.print("Masukkan banyaknya pegawai: ");
                }
            } else {
                System.out.println("Input tidak valid. Masukkan bilangan bulat.");
                System.out.print("Masukkan banyaknya pegawai: ");
                scanner.next(); // consume the invalid token
            }
        }

        pegawai[] pegawaiArray = new pegawai[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Pegawai " + (i + 1) + ":");
            System.out.print("Nama: ");
            scanner.nextLine(); // consume newline
            String nama = scanner.nextLine();

            System.out.print("Golongan (1/2/3): ");
            int golongan = scanner.nextInt();
            System.out.print("Jam Kerja: ");
            int jamKerja = scanner.nextInt();

            pegawaiArray[i] = new pegawai (nama, golongan, jamKerja);
        }

        System.out.println("\\nHasil Perhitungan Gaji Pegawai:");
        for (pegawai pegawai : pegawaiArray) {
            System.out.println(pegawai);
        }

        scanner.close();
    }
}
