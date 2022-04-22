package com.database.perpus.eksekusi;

import com.database.perpus.model.dto.Dto1DataPerpus;
import com.database.perpus.model.dto.Dto2DataPerpus;
import com.database.perpus.model.entity.Entity1DataPerpus;
import com.database.perpus.model.entity.Entity2DataPerpus;
import com.database.perpus.repository.Repo1DataPerpus;
import com.database.perpus.repository.Repo2DataPerpus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/perpus")
public class EksekusiData {
    private final Repo1DataPerpus repo1DataPerpus;
    private final Repo2DataPerpus repo2DataPerpus;
    public EksekusiData(Repo1DataPerpus repo1DataPerpus, Repo2DataPerpus repo2DataPerpus) {
        this.repo1DataPerpus = repo1DataPerpus;
        this.repo2DataPerpus = repo2DataPerpus;
    }



    public Dto1DataPerpus convert1EntityToDto(Entity1DataPerpus entity){
        Dto1DataPerpus dto = new Dto1DataPerpus();
        dto.setId(entity.getId());
        dto.setNama(entity.getNama());
        dto.setJabatan(entity.getJabatan());
        dto.setNo_telp(entity.getNo_telp());
        dto.setAlamat(entity.getAlamat());
        return dto;
    }
    public Entity1DataPerpus convert1DtoToEntity(Dto1DataPerpus dto){
        Entity1DataPerpus entity = new Entity1DataPerpus();
        entity.setId(dto.getId());
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
}
