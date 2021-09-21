package com.sg.sistema.mecanica.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
  ClienteRepository clienteRepository;

    public void save(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public List<Cliente> findAll(){
        return  clienteRepository.findAll();
    }

    public Cliente findById(Long id){
        return clienteRepository.getById(id);
    }
}
