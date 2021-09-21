package com.sg.sistema.mecanica.Carro;

import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    @Autowired
    CarroRepository carroRepository;

    public List<Carro> findAll() {
        return carroRepository.findAll();
    }

    public void save(Carro carro) {
        carroRepository.save(carro);
    }
}
