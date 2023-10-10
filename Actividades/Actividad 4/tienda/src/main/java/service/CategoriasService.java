package service;

import data.Categorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CategoriasRepository;

import java.util.List;

@Service
public class CategoriasService {

    private final CategoriasRepository categoriasRepository;

    @Autowired
    public CategoriasService(CategoriasRepository categoriasRepository) {
        this.categoriasRepository = categoriasRepository;
    }

    public List<Categorias> obtenerTodasLasCategorias() {
        return categoriasRepository.findAll();
    }

}
