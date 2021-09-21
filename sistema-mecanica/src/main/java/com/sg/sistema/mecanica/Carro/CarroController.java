package com.sg.sistema.mecanica.Carro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {
    @Autowired
    CarroService carroService;

    @PostMapping
    public void cadastrarCarro(@RequestBody Carro carro){
        carroService.save(carro);
    }

    @GetMapping
    public List<Carro> listarCarro(){
        return  carroService.findAll();
    }


}
