package service;

import data.Comprador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CompradorRepository;

import java.util.List;

@Service
public class CompradorService {

    private final CompradorRepository compradorRepository;

    @Autowired
    public CompradorService(CompradorRepository compradorRepository) {
        this.compradorRepository = compradorRepository;
    }

    public List<Comprador> obtenerTodosLosCompradores() {
        return compradorRepository.findAll();
    }

}

