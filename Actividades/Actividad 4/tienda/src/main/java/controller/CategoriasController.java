package controller;

import data.Categorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CategoriasService;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriasController {

    private final CategoriasService categoriasService;

    @Autowired
    public CategoriasController(CategoriasService categoriasService) {
        this.categoriasService = categoriasService;
    }

    @GetMapping
    public ResponseEntity<List<Categorias>> obtenerTodasLasCategorias() {
        List<Categorias> categorias = categoriasService.obtenerTodasLasCategorias();
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }

}
