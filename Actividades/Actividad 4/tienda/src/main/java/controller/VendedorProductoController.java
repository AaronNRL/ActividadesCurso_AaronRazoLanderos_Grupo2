package controller;

import data.VendedorProducto; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.VendedorProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/vendedor-productos")
public class VendedorProductoController {

    private final VendedorProductoService vendedorProductoService;

    @Autowired
    public VendedorProductoController(VendedorProductoService vendedorProductoService) {
        this.vendedorProductoService = vendedorProductoService;
    }

    @GetMapping
    public ResponseEntity<List<VendedorProducto>> obtenerTodosLosVendedorProductos() {
        List<VendedorProducto> vendedorProductos = vendedorProductoService.obtenerTodosLosVendedorProductos();
        return new ResponseEntity<>(vendedorProductos, HttpStatus.OK);
    }

}

