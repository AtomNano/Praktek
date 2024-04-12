package TugasPBO;

public class pegawai {
    
        private String nama;
        private int golongan;
        private int jamKerja;
    
        public pegawai(String nama,  int golongan, int jamKerja) {
            this.nama = nama;
            this.golongan = golongan;
            this.jamKerja = jamKerja;
        }
    
        public int hitungGajiPokok() {
            switch (golongan) {
                case 1:
                    return 1000000;
                case 2:
                    return 1500000;
                case 3:
                    return 2000000;
                default:
                    return 0;
            }
        }
    
        public int hitungTotalUpah() {
            int upahNormal = 50000 * Math.min(jamKerja, 25);
            int upahLembur = jamKerja > 25 ? (jamKerja - 25) * 75000 : 0;
            return upahNormal + upahLembur;
        }
    
        public int hitungTotalGaji() {
            return hitungGajiPokok() + hitungTotalUpah();
        }
    
        @Override
        public String toString() {
            return "Nama: " + nama + ", NIK: " + ", Total Gaji: " + hitungTotalGaji();
        }
    }
    

