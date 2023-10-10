package controller;

import data.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.VendedorService;

import java.util.List;

@RestController
@RequestMapping("/api/vendedores")
public class VendedorController {

    private final VendedorService vendedorService;

    @Autowired
    public VendedorController(VendedorService vendedorService) {
        this.vendedorService = vendedorService;
    }

    @GetMapping
    public ResponseEntity<List<Vendedor>> obtenerTodosLosVendedores() {
        List<Vendedor> vendedores = vendedorService.obtenerTodosLosVendedores();
        return new ResponseEntity<>(vendedores, HttpStatus.OK);
    }

}

