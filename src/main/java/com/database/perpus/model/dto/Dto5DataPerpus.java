package com.database.perpus.model.dto;

import java.util.Date;

public class Dto5DataPerpus {
    private int id_pinjam;
    private Date t_pinjam;
    private Date t_kembali;
    private int id_buku;
    private int id_anggota;
    private int id_petugas;

    public int getId_pinjam() {
        return id_pinjam;
    }

    public void setId_pinjam(int id_pinjam) {
        this.id_pinjam = id_pinjam;
    }

    public Date getT_pinjam() {
        return t_pinjam;
    }

    public void setT_pinjam(Date t_pinjam) {
        this.t_pinjam = t_pinjam;
    }

    public Date getT_kembali() {
        return t_kembali;
    }

    public void setT_kembali(Date t_kembali) {
        this.t_kembali = t_kembali;
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
