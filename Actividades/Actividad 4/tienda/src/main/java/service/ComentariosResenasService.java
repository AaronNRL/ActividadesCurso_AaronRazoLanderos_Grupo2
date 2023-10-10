package service;

import data.ComentariosResenas; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ComentariosResenasRepository;

import java.util.List;

@Service
public class ComentariosResenasService {

    private final ComentariosResenasRepository comentariosResenasRepository;

    @Autowired
    public ComentariosResenasService(ComentariosResenasRepository comentariosResenasRepository) {
        this.comentariosResenasRepository = comentariosResenasRepository;
    }

    public List<ComentariosResenas> obtenerTodosLosComentariosResenas() {
        return comentariosResenasRepository.findAll();
    }

}

