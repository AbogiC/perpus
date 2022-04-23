package com.database.perpus.model.dto;

import java.util.Date;

public class Dto6DataPerpus {
    private int id_kembali;
    private Date t_kembali;
    private int denda;
    private int id_buku;
    private int id_anggota;
    private int id_petugas;

    public int getId_kembali() {
        return id_kembali;
    }

    public void setId_kembali(int id_kembali) {
        this.id_kembali = id_kembali;
    }

    public Date getT_kembali() {
        return t_kembali;
    }

    public void setT_kembali(Date t_kembali) {
        this.t_kembali = t_kembali;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public int getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(int id_anggota) {
        this.id_anggota = id_anggota;
    }

    public int getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(int id_petugas) {
        this.id_petugas = id_petugas;
    }
}
