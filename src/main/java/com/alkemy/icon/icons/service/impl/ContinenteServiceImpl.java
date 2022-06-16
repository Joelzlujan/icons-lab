package com.alkemy.icon.icons.service.impl;

import com.alkemy.icon.icons.dto.ContinenteDTO;
import com.alkemy.icon.icons.entity.ContinentEntity;
import com.alkemy.icon.icons.mapper.ContinenteMapper;
import com.alkemy.icon.icons.repository.ContinenteRepository;
import com.alkemy.icon.icons.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinenteServiceImpl implements ContinenteService {

    @Autowired
    private ContinenteMapper continenteMapper;
    @Autowired
    private ContinenteRepository continenteRepository;
    public ContinenteDTO save (ContinenteDTO dto){
        ContinentEntity entity = continenteMapper.continenteDTO2Entity(dto);
        ContinentEntity entitySaved = continenteRepository.save(entity);
        ContinenteDTO result = continenteMapper.continentEntity2DTO(entitySaved);
        return result;

    }

    public List<ContinenteDTO> getAllContinentes() {
        List<ContinentEntity> entities = continenteRepository.findAll();
        List<ContinenteDTO> result = continenteMapper.continenteEntityList2DTOList(entities);
        return result;
    }
    public void delete(Long id){
        continenteRepository.deleteById(id);
    }
}
