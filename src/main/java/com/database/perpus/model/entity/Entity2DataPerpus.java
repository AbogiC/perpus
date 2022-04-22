package com.database.perpus.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_anggota")
public class Entity2DataPerpus {
    @Id
    @Column(name = "id_anggota")
    private int id;
    @Column(name = "kode_anggota", unique = true)
    private char kode;
    @Column(name = "nama_anggota")
    private String nama;
    @Column(name = "jk_anggota")
    private char jk;
    @Column(name = "jurusan_anggota")
    private char jurusan;
    @Column(name = "no_telp_anggota")
    private char no_telp;
    @Column(name = "alamat_anggota")
    private String alamat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getKode() {
        return kode;
    }

    public void setKode(char kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getJk() {
        return jk;
    }

    public void setJk(char jk) {
        this.jk = jk;
    }

    public char getJurusan() {
        return jurusan;
    }

    public void setJurusan(char jurusan) {
        this.jurusan = jurusan;
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
