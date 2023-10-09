package controller;

import data.ComentariosResenas; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ComentariosResenasService;

import java.util.List;

@RestController
@RequestMapping("/api/comentarios-resenas")
public class ComentariosResenasController {

    private final ComentariosResenasService comentariosResenasService;

    @Autowired
    public ComentariosResenasController(ComentariosResenasService comentariosResenasService) {
        this.comentariosResenasService = comentariosResenasService;
    }

    @GetMapping
    public ResponseEntity<List<ComentariosResenas>> obtenerTodosLosComentariosResenas() {
        List<ComentariosResenas> comentariosResenas = comentariosResenasService.obtenerTodosLosComentariosResenas();
        return new ResponseEntity<>(comentariosResenas, HttpStatus.OK);
    }

}

