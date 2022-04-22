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
    private int id;
    @Column(name = "nama_petugas")
    private String nama;
    @Column(name = "jabatan_petugas")
    private String jabatan;
    @Column(name = "no_telp_petugas")
    private Long no_telp;
    @Column(name = "alamat_petugas")
    private String alamat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Long getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(Long no_telp) {
        this.no_telp = no_telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
