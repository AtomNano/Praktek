package Luthfi_PBO.controller;

import Luthfi_PBO.model.FormMahasiswa;
import Luthfi_PBO.model.MahasiswaDao;
import Mahasiswa.Mahasiswa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MahasiswaController {
    private FormMahasiswa formMahasiswa;
    private Mahasiswa mahasiswa;
    private MahasiswaDao mahasiswaDao;

    public MahasiswaController(FormMahasiswa formMahasiswa) {
        this.formMahasiswa = formMahasiswa;
        this.mahasiswaDao = new MahasiswaDao();
    }

    public void cancel() {
        formMahasiswa.getTxtNOBP().setText("");
        formMahasiswa.getTxtNama().setText("");
        formMahasiswa.getTxtAlamat().setText("");
        formMahasiswa.getTxtTglLahir().setText("");
        isiJenisKelamin();
    }

    public void isiJenisKelamin() {
        formMahasiswa.getCboJenisKelamin().removeAllItems();
        formMahasiswa.getCboJenisKelamin().addItem("L");
        formMahasiswa.getCboJenisKelamin().addItem("P");
    }

    public void insert() {
        mahasiswa = new Mahasiswa();
        mahasiswa.setNobp(formMahasiswa.getTxtNOBP().getText());
        mahasiswa.setNama(formMahasiswa.getTxtNama().getText());
        mahasiswa.setAlamat(formMahasiswa.getTxtAlamat().getText());
        mahasiswa.setJenisKelamin(formMahasiswa.getCboJenisKelamin().getSelectedItem().toString());
        mahasiswa.setTglLahir(formMahasiswa.getTxtTglLahir().getText());
        mahasiswaDao.insert(mahasiswa);
        JOptionPane.showMessageDialog(formMahasiswa, "Entry Data Ok");
    }

    public void viewData() {
        DefaultTableModel model = (DefaultTableModel) formMahasiswa.getTabelMahasiswa().getModel();
        model.setNumRows(0);
        List<Mahasiswa> list = mahasiswaDao.getAllMahasiswa();
        for (Mahasiswa mahasiswa : list) {
            Object[] data = {
                mahasiswa.getNobp(),
                mahasiswa.getNama(),
                mahasiswa.getAlamat(),
                mahasiswa.getJenisKelamin(),
                mahasiswa.getTglLahir()
            };
            model.addRow(data);
        }
    }

    public void getMahasiswa() {
        int index = formMahasiswa.getTabelMahasiswa().getSelectedRow();
        mahasiswa = mahasiswaDao.getMahasiswa(index);
        if (mahasiswa != null) {
            formMahasiswa.getTxtNOBP().setText(mahasiswa.getNobp());
            formMahasiswa.getTxtNama().setText(mahasiswa.getNama());
            formMahasiswa.getTxtAlamat().setText(mahasiswa.getAlamat());
            formMahasiswa.getCboJenisKelamin().setSelectedItem(mahasiswa.getJenisKelamin());
            formMahasiswa.getTxtTglLahir().setText(mahasiswa.getTglLahir());
        } else {
            JOptionPane.showMessageDialog(formMahasiswa, "Data tidak ditemukan");
        }
    }

    public void update() {
        mahasiswa.setNobp(formMahasiswa.getTxtNOBP().getText());
        mahasiswa.setNama(formMahasiswa.getTxtNama().getText());
        mahasiswa.setAlamat(formMahasiswa.getTxtAlamat().getText());
        mahasiswa.setJenisKelamin(formMahasiswa.getCboJenisKelamin().getSelectedItem().toString());
        mahasiswa.setTglLahir(formMahasiswa.getTxtTglLahir().getText());
        mahasiswaDao.update(mahasiswa);
        JOptionPane.showMessageDialog(formMahasiswa, "Update Data OK");
    }

    public void delete() {
        int index = formMahasiswa.getTabelMahasiswa().getSelectedRow();
        mahasiswaDao.delete(index);
        JOptionPane.showMessageDialog(formMahasiswa, "Delete Data Ok");
    }

    public void tampil() {
        // Implement the method or remove it if not needed
    }
}
