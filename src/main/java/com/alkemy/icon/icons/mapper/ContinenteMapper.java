package com.alkemy.icon.icons.mapper;

import com.alkemy.icon.icons.dto.ContinenteDTO;
import com.alkemy.icon.icons.entity.ContinentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinenteMapper {
    public ContinentEntity continenteDTO2Entity(ContinenteDTO dto){
        ContinentEntity continentEntity = new ContinentEntity();
        continentEntity.setImagen(dto.getImagen());
        continentEntity.setDenominacion(dto.getDenominacion());
        return continentEntity;
    }
    public ContinenteDTO continentEntity2DTO(ContinentEntity entity){
        ContinenteDTO dto = new ContinenteDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        return dto;
    }
    public List<ContinenteDTO> continenteEntityList2DTOList(List<ContinentEntity>entities){
        List<ContinenteDTO> dtos = new ArrayList<>();
        for (ContinentEntity entity: entities) {
        dtos.add(this.continentEntity2DTO(entity));
        }
        return dtos;
    }
}
