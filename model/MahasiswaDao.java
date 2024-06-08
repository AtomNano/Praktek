package Luthfi_PBO.model;

import Mahasiswa.Mahasiswa;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDao {
    private List<Mahasiswa> data = new ArrayList<>();

    public MahasiswaDao() { }

    public void insert(Mahasiswa mahasiswa) {
        data.add(mahasiswa);
    }

    public void update(Mahasiswa mahasiswa) {
        int index = data.indexOf(mahasiswa);
        if (index != -1) {
            data.set(index, mahasiswa);
        }
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Mahasiswa getMahasiswa(int index) {
        return data.get(index);
    }

    public List<Mahasiswa> getAllMahasiswa() {
        return data;
    }
}
