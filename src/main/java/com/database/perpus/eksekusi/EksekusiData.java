package com.database.perpus.eksekusi;

import com.database.perpus.model.dto.Dto1DataPerpus;
import com.database.perpus.model.entity.Entity1DataPerpus;
import com.database.perpus.repository.Repo1DataPerpus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/perpus")
public class EksekusiData {
    private final Repo1DataPerpus repo1DataPerpus;
    public EksekusiData(Repo1DataPerpus repo1DataPerpus) {
        this.repo1DataPerpus = repo1DataPerpus;
    }

    public Dto1DataPerpus convertEntityToDto(Entity1DataPerpus entity){
        Dto1DataPerpus dto = new Dto1DataPerpus();
        dto.setId(entity.getId());
        dto.setNama(entity.getNama());
        dto.setJabatan(entity.getJabatan());
        dto.setNo_telp(entity.getNo_telp());
        dto.setAlamat(entity.getAlamat());
        return dto;
    }
    public Entity1DataPerpus convertDtoToEntity(Dto1DataPerpus dto){
        Entity1DataPerpus entity = new Entity1DataPerpus();
        entity.setId(dto.getId());
        entity.setNama(dto.getNama());
        entity.setJabatan(dto.getJabatan());
        entity.setNo_telp(dto.getNo_telp());
        entity.setAlamat(dto.getAlamat());
        return entity;
    }

    @GetMapping("/listdataperpus")
    public List<Dto1DataPerpus> getListPerpus(){
        List<Dto1DataPerpus> list = new ArrayList<>();
        for(Entity1DataPerpus m : repo1DataPerpus.findAll()){
            list.add(convertEntityToDto(m));
        }
        return list;
    }

    @PostMapping("/saveperpus")
    public Dto1DataPerpus saveperpus(@RequestBody Dto1DataPerpus dto){
        Entity1DataPerpus entity = convertDtoToEntity(dto);
        repo1DataPerpus.save(entity);
        return dto;
    }
}
