package com.database.perpus.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_buku")
public class Entity3DataPerpus {
    @Id
    @Column(name = "id_buku")
    private int id_buku;
    @Column(name = "kode_buku", unique = true)
    private char kode;
    @Column(name = "judul_buku")
    private String judul;
    @Column(name = "penulis_buku")
    private String penulis;
    @Column(name = "penerbit_buku")
    private String penerbit;
    @Column(name = "tahun_penerbit")
    private char tahun;
    @Column(name = "stok")
    private int stok;

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id) {
        this.id_buku = id;
    }

    public char getKode() {
        return kode;
    }

    public void setKode(char kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public char getTahun() {
        return tahun;
    }

    public void setTahun(char tahun) {
        this.tahun = tahun;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
