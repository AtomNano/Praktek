package model;
import java.util.ArrayList;
import java.util.List;

import Mahasiswa.Dosen;


public class DosenDao {
    
    private List<Dosen> data = new ArrayList<>();


    public DosenDao() { }

    public void insert(Dosen dosen) {
        data.add(dosen);
    }

    public void update(Dosen dosen) {
        int index = data.indexOf(dosen);
        if (index != -1) {
            data.set(index, dosen);
        }
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Dosen getDosen(int index) {
        return data.get(index);
    }

    public List<Dosen> getAllDosen() {
        return data;
    }
}


