
package luthfiDb_2025.Mahasiswa;


public class buku 
{
    private String kode_buku;
    private String judul_buku;
    private String penerbit;
    private String pengarang;
    private String tahun;
    
    public buku()
    { 
    }

    public buku(String kode_buku, String judul_buku, String penerbit, String pengarang, String tahun) {
        this.kode_buku = kode_buku;
        this.judul_buku = judul_buku;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
        this.tahun = tahun;
    }

    public String getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(String kode_buku) {
        this.kode_buku = kode_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    

    

  
}
