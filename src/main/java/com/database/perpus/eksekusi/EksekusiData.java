package com.database.perpus.eksekusi;

import com.database.perpus.model.dto.*;
import com.database.perpus.model.entity.*;
import com.database.perpus.repository.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/perpus")
public class EksekusiData {
    private final Repo1DataPerpus repo1DataPerpus;
    private final Repo2DataPerpus repo2DataPerpus;
    private final Repo3DataPerpus repo3DataPerpus;
    private final Repo4DataPerpus repo4DataPerpus;
    private final Repo5DataPerpus repo5DataPerpus;
    private final Repo6DataPerpus repo6DataPerpus;
    public EksekusiData(Repo1DataPerpus repo1DataPerpus, Repo2DataPerpus repo2DataPerpus, Repo3DataPerpus repo3DataPerpus, Repo4DataPerpus repo4DataPerpus, Repo5DataPerpus repo5DataPerpus, Repo6DataPerpus repo6DataPerpus) {
        this.repo1DataPerpus = repo1DataPerpus;
        this.repo2DataPerpus = repo2DataPerpus;
        this.repo3DataPerpus = repo3DataPerpus;
        this.repo4DataPerpus = repo4DataPerpus;
        this.repo5DataPerpus = repo5DataPerpus;
        this.repo6DataPerpus = repo6DataPerpus;
    }

    public Dto1DataPerpus convert1EntityToDto(Entity1DataPerpus entity){
        Dto1DataPerpus dto = new Dto1DataPerpus();
        dto.setId_petugas(entity.getId_petugas());
        dto.setNama(entity.getNama());
        dto.setJabatan(entity.getJabatan());
        dto.setNo_telp(entity.getNo_telp());
        dto.setAlamat(entity.getAlamat());
        return dto;
    }
    public Entity1DataPerpus convert1DtoToEntity(Dto1DataPerpus dto){
        Entity1DataPerpus entity = new Entity1DataPerpus();
        entity.setId_petugas(dto.getId_petugas());
        entity.setNama(dto.getNama());
        entity.setJabatan(dto.getJabatan());
        entity.setNo_telp(dto.getNo_telp());
        entity.setAlamat(dto.getAlamat());
        return entity;
    }
    public Dto2DataPerpus convert2EntityToDto(Entity2DataPerpus entity){
        Dto2DataPerpus dto = new Dto2DataPerpus();
        dto.setId(entity.getId());
        dto.setKode(entity.getKode());
        dto.setNama(entity.getNama());
        dto.setJk(entity.getJk());
        dto.setJurusan(entity.getJurusan());
        dto.setNo_telp(entity.getNo_telp());
        dto.setAlamat(entity.getAlamat());
        return dto;
    }
    public Entity2DataPerpus convert2DtoToEntity(Dto2DataPerpus dto){
        Entity2DataPerpus entity = new Entity2DataPerpus();
        entity.setId(dto.getId());
        entity.setKode(dto.getKode());
        entity.setNama(dto.getNama());
        entity.setJk(dto.getJk());
        entity.setJurusan(dto.getJurusan());
        entity.setNo_telp(dto.getNo_telp());
        entity.setAlamat(dto.getAlamat());
        return entity;
    }
    public Dto3DataPerpus convert3EntityToDto(Entity3DataPerpus entity){
        Dto3DataPerpus dto = new Dto3DataPerpus();
        dto.setId_buku(entity.getId_buku());
        dto.setKode(entity.getKode());
        dto.setJudul(entity.getJudul());
        dto.setPenulis(entity.getPenulis());
        dto.setPenerbit(entity.getPenerbit());
        dto.setTahun(entity.getTahun());
        dto.setStok(entity.getStok());
        return dto;
    }
    public Entity3DataPerpus convert3DtoToEntity(Dto3DataPerpus dto){
        Entity3DataPerpus entity = new Entity3DataPerpus();
        entity.setId_buku(dto.getId_buku());
        entity.setKode(dto.getKode());
        entity.setJudul(dto.getJudul());
        entity.setPenulis(dto.getPenulis());
        entity.setPenerbit(dto.getPenerbit());
        entity.setTahun(dto.getTahun());
        entity.setStok(dto.getStok());
        return entity;
    }
    public Dto4DataPerpus convert4EntityToDto(Entity4DataPerpus entity){
        Dto4DataPerpus dto = new Dto4DataPerpus();
        dto.setId(entity.getId());
        dto.setN_rak(entity.getN_rak());
        dto.setL_rak(entity.getL_rak());
        dto.setId_buku(entity.getId_buku());
        return dto;
    }
    public Entity4DataPerpus convert4DtoToEntity(Dto4DataPerpus dto){
        Entity4DataPerpus entity = new Entity4DataPerpus();
        entity.setId(dto.getId());
        entity.setN_rak(dto.getN_rak());
        entity.setL_rak(dto.getL_rak());
        entity.setId_buku(dto.getId_buku());
        return entity;
    }
    public Dto5DataPerpus convert5EntityToDto(Entity5DataPerpus entity){
        Dto5DataPerpus dto = new Dto5DataPerpus();
        dto.setId_pinjam(entity.getId_pinjam());
        dto.setT_pinjam(entity.getT_pinjam());
        dto.setT_kembali(entity.getT_kembali());
        dto.setId_buku(entity.getId_buku());
        dto.setId_anggota(entity.getId_anggota());
        dto.setId_petugas(entity.getId_petugas());
        return dto;
    }
    public Entity5DataPerpus convert5DtoToEntity(Dto5DataPerpus dto){
        Entity5DataPerpus entity = new Entity5DataPerpus();
        entity.setId_pinjam(dto.getId_pinjam());
        entity.setT_pinjam(dto.getT_pinjam());
        entity.setT_kembali(dto.getT_kembali());
        entity.setId_buku(dto.getId_buku());
        entity.setId_anggota(dto.getId_anggota());
        entity.setId_petugas(dto.getId_petugas());
        return entity;
    }
    public Dto6DataPerpus convert6EntityToDto(Entity6DataPerpus entity){
        Dto6DataPerpus dto = new Dto6DataPerpus();
        dto.setId_kembali(entity.getId_kembali());
        dto.setT_kembali(entity.getT_kembali());
        dto.setDenda(entity.getDenda());
        dto.setId_buku(entity.getId_buku());
        dto.setId_anggota(entity.getId_anggota());
        dto.setId_petugas(entity.getId_petugas());
        return dto;
    }
    public Entity6DataPerpus convert6DtoToEntity(Dto6DataPerpus dto){
        Entity6DataPerpus entity = new Entity6DataPerpus();
        entity.setT_kembali(dto.getT_kembali());
        entity.setT_kembali(dto.getT_kembali());
        entity.setId_buku(dto.getId_buku());
        entity.setId_anggota(dto.getId_anggota());
        entity.setId_petugas(dto.getId_petugas());
        return entity;
    }

    @GetMapping("/listdatapetugas")
    public List<Dto1DataPerpus> getListPetugas(){
        List<Dto1DataPerpus> list = new ArrayList<>();
        for(Entity1DataPerpus m : repo1DataPerpus.findAll()){
            list.add(convert1EntityToDto(m));
        }
        return list;
    }
    @PostMapping("/savepetugas")
    public Dto1DataPerpus savepetugas(@RequestBody Dto1DataPerpus dto){
        Entity1DataPerpus entity = convert1DtoToEntity(dto);
        repo1DataPerpus.save(entity);
        return dto;
    }

    @GetMapping("/listdataanggota")
    public List<Dto2DataPerpus> getListAnggota(){
        List<Dto2DataPerpus> list = new ArrayList<>();
        for(Entity2DataPerpus m : repo2DataPerpus.findAll()){
            list.add(convert2EntityToDto(m));
        }
        return list;
    }
    @PostMapping("/savepeanggota")
    public Dto2DataPerpus saveanggota(@RequestBody Dto2DataPerpus dto){
        Entity2DataPerpus entity = convert2DtoToEntity(dto);
        repo2DataPerpus.save(entity);
        return dto;
    }

    @GetMapping("/listdatabuku")
    public List<Dto3DataPerpus> getListBuku(){
        List<Dto3DataPerpus> list = new ArrayList<>();
        for(Entity3DataPerpus m : repo3DataPerpus.findAll()){
            list.add(convert3EntityToDto(m));
        }
        return list;
    }
    @PostMapping("/savebuku")
    public Dto3DataPerpus savebuku(@RequestBody Dto3DataPerpus dto){
        Entity3DataPerpus entity = convert3DtoToEntity(dto);
        repo3DataPerpus.save(entity);
        return dto;
    }

    @GetMapping("/listdatarak")
    public List<Dto4DataPerpus> getListRak(){
        List<Dto4DataPerpus> list = new ArrayList<>();
        for(Entity4DataPerpus m : repo4DataPerpus.findAll()){
            list.add(convert4EntityToDto(m));
        }
        return list;
    }
    @PostMapping("/saverak")
    public Dto4DataPerpus saverak(@RequestBody Dto4DataPerpus dto){
        Entity4DataPerpus entity = convert4DtoToEntity(dto);
        repo4DataPerpus.save(entity);
        return dto;
    }
    @GetMapping("/listdatapinjam")
    public List<Dto5DataPerpus> getListPinjam(){
        List<Dto5DataPerpus> list = new ArrayList<>();
        for(Entity5DataPerpus m : repo5DataPerpus.findAll()){
            list.add(convert5EntityToDto(m));
        }
        return list;
    }
    @PostMapping("/savepinjam")
    public Dto5DataPerpus savepinjam(@RequestBody Dto5DataPerpus dto){
        Entity5DataPerpus entity = convert5DtoToEntity(dto);
        repo5DataPerpus.save(entity);
        return dto;
    }
    @GetMapping("/listdatakembali")
    public List<Dto6DataPerpus> getListKembali(){
        List<Dto6DataPerpus> list = new ArrayList<>();
        for(Entity6DataPerpus m : repo6DataPerpus.findAll()){
            list.add(convert6EntityToDto(m));
        }
        return list;
    }
    @PostMapping("/savekembali")
    public Dto6DataPerpus savekembali(@RequestBody Dto6DataPerpus dto){
        Entity6DataPerpus entity = convert6DtoToEntity(dto);
        repo6DataPerpus.save(entity);
        return dto;
    }
}
