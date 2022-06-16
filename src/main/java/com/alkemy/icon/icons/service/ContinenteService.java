package com.alkemy.icon.icons.service;

import com.alkemy.icon.icons.dto.ContinenteDTO;

import java.util.List;

public interface ContinenteService {
    ContinenteDTO save (ContinenteDTO dto);

    List<ContinenteDTO> getAllContinentes();

    ContinenteDTO delete(Long id);

}
