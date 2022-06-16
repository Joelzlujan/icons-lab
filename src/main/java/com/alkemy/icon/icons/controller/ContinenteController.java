package com.alkemy.icon.icons.controller;

import com.alkemy.icon.icons.dto.ContinenteDTO;
import com.alkemy.icon.icons.service.ContinenteService;
import com.alkemy.icon.icons.service.impl.ContinenteServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("continentes")
public class ContinenteController {

    @Autowired
    private ContinenteService continenteService;

    @GetMapping
    public ResponseEntity<List<ContinenteDTO>> getAll() {
        List<ContinenteDTO> continentes = continenteService.getAllContinentes();
        return ResponseEntity.ok().body(continentes);
    }

    @PostMapping
    public ResponseEntity<ContinenteDTO> save(@RequestBody ContinenteDTO continente) {
        //save continente
        //201, continente guardado
        ContinenteDTO continenteGuardado = continenteService.save(continente);
        return ResponseEntity.status(HttpStatus.CREATED).body(continenteGuardado);
    }
    @PutMapping
    public ResponseEntity<ContinenteDTO> update


/*    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.continenteService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }*/
}
