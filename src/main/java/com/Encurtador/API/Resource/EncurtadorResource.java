package com.Encurtador.API.Resource;

import com.Encurtador.API.Services.EncurtadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/url")
public class EncurtadorResource {

    @Autowired
    private EncurtadorService service;


    @PostMapping()
    public ResponseEntity<String> shortenURL(@RequestBody String url){
        String newurl = service.getNewURL(url);
        return ResponseEntity.ok().body(newurl);

    }
}
