package com.database.perpus.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_rak")
public class Entity4DataPerpus {
    @Id
    @Column(name = "id_rak")
    private int id;
    @Column(name = "nama_rak")
    private String n_rak;
    @Column(name = "lokasi_rak")
    private char l_rak;
    @Column(name = "id_buku")
    private int id_buku;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getN_rak() {
        return n_rak;
    }

    public void setN_rak(String n_rak) {
        this.n_rak = n_rak;
    }

    public char getL_rak() {
        return l_rak;
    }

    public void setL_rak(char l_rak) {
        this.l_rak = l_rak;
    }

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }
}
