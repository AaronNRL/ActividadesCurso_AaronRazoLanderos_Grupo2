package controller;

import data.Transacciones; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TransaccionesService;

import java.util.List;

@RestController
@RequestMapping("/api/transacciones")
public class TransaccionesController {

    private final TransaccionesService transaccionesService;

    @Autowired
    public TransaccionesController(TransaccionesService transaccionesService) {
        this.transaccionesService = transaccionesService;
    }

    @GetMapping
    public ResponseEntity<List<Transacciones>> obtenerTodasLasTransacciones() {
        List<Transacciones> transacciones = transaccionesService.obtenerTodasLasTransacciones();
        return new ResponseEntity<>(transacciones, HttpStatus.OK);
    }

}


