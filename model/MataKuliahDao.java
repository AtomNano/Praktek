package model;

import Mahasiswa.MataKuliah;
import java.util.ArrayList;
import java.util.List;

public class MataKuliahDao {
    private List<MataKuliah> data = new ArrayList<>();

    public MataKuliahDao() { }

    public void insert(MataKuliah mataKuliah) {
        data.add(mataKuliah);
    }

    public void update(MataKuliah mataKuliah) {
        int index = data.indexOf(mataKuliah);
        if (index != -1) {
            data.set(index, mataKuliah);
        }
    }

    public void delete(int index) {
        data.remove(index);
    }

    public MataKuliah getMataKuliah(int index) {
        return data.get(index);
    }

    public List<MataKuliah> getAllMataKuliah() {
        return data;
