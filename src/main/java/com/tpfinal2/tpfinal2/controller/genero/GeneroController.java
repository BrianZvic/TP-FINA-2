package com.tpfinal2.tpfinal2.controller.genero;

import com.tpfinal2.tpfinal2.dominio.Genero;
import com.tpfinal2.tpfinal2.repository.GeneroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
@RequestMapping(path = "/api/generos")
public class GeneroController {
    private GeneroRepository generoRepository;
    @GetMapping()
    @ResponseBody
    public Iterable<Genero> getAllGeneros(){
       return generoRepository.findAll();
    }
}
