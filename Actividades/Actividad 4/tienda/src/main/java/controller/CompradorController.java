package controller;

import data.Comprador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CompradorService;

import java.util.List;

@RestController
@RequestMapping("/api/compradores")
public class CompradorController {

    private final CompradorService compradorService;

    @Autowired
    public CompradorController(CompradorService compradorService) {
        this.compradorService = compradorService;
    }

    @GetMapping
    public ResponseEntity<List<Comprador>> obtenerTodosLosCompradores() {
        List<Comprador> compradores = compradorService.obtenerTodosLosCompradores();
        return new ResponseEntity<>(compradores, HttpStatus.OK);
    }

}


