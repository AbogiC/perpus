package com.database.perpus.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_petugas")
public class Entity1DataPerpus {
    @Id
    @Column(name = "id_petugas")
    private int id_petugas;
    @Column(name = "nama_petugas")
    private String nama;
    @Column(name = "jabatan_petugas")
    private String jabatan;
    @Column(name = "no_telp_petugas")
    private char no_telp;
    @Column(name = "alamat_petugas")
    private String alamat;

    public int getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(int id) {
        this.id_petugas = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public char getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(char no_telp) {
        this.no_telp = no_telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

