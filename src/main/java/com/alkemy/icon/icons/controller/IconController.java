package com.alkemy.icon.icons.controller;

import com.alkemy.icon.icons.dto.IconDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("icons")
public class IconController {
    @PostMapping
    public ResponseEntity<IconDTO>save (@RequestBody IconDTO icon){
        IconDTO result = iconService.save(icon);
        return new ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
