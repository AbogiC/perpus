package com.database.perpus.model.dto;

public class Dto3DataPerpus {
    private int id_buku;
    private char kode;
    private String judul;
    private String penulis;
    private String penerbit;
    private char tahun;
    private int stok;

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
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
