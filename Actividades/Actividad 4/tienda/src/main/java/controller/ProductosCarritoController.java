package controller;

import data.ProductosCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ProductosCarritoService;

import java.util.List;

@RestController
@RequestMapping("/productos-carrito")
public class ProductosCarritoController {

    private final ProductosCarritoService productosCarritoService;

    @Autowired
    public ProductosCarritoController(ProductosCarritoService productosCarritoService) {
        this.productosCarritoService = productosCarritoService;
    }

    @GetMapping
    public ResponseEntity<List<ProductosCarrito>> obtenerTodosLosProductosCarrito() {
        List<ProductosCarrito> productosCarrito = productosCarritoService.obtenerTodosLosProductosCarrito();
        return new ResponseEntity<>(productosCarrito, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductosCarrito> guardarProductoCarrito(@RequestBody ProductosCarrito productoCarrito) {
        ProductosCarrito nuevoProductoCarrito = productosCarritoService.guardarProductoCarrito(productoCarrito);
        return new ResponseEntity<>(nuevoProductoCarrito, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProductoCarrito(@PathVariable Long id) {
        productosCarritoService.eliminarProductoCarrito(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

