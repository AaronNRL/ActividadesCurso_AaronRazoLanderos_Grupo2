package controller;

import data.TransaccionesProductos; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TransaccionesProductosService;

import java.util.List;

@RestController
@RequestMapping("/api/transacciones-productos")
public class TransaccionesProductosController {

    private final TransaccionesProductosService transaccionesProductosService;

    @Autowired
    public TransaccionesProductosController(TransaccionesProductosService transaccionesProductosService) {
        this.transaccionesProductosService = transaccionesProductosService;
    }

    @GetMapping
    public ResponseEntity<List<TransaccionesProductos>> obtenerTodosLosTransaccionesProductos() {
        List<TransaccionesProductos> transaccionesProductos = transaccionesProductosService.obtenerTodosLosTransaccionesProductos();
        return new ResponseEntity<>(transaccionesProductos, HttpStatus.OK);
    }

}

