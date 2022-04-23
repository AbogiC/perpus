package com.database.perpus.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_kembali")
public class Entity6DataPerpus {
    @Id
    @Column(name = "id_kembali")
    private int id_kembali;
    @Column(name = "t_kembali")
    private Date t_kembali;
    @Column(name = "denda")
    private int denda;
    @Column(name = "id_buku")
    private int id_buku;
    @Column(name = "id_anggota")
    private int id_anggota;
    @Column(name = "id_petugas")
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
