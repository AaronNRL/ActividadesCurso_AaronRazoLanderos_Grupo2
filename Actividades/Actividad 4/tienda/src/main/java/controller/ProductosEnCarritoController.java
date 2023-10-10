package controller;

import data.ProductosEnCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ProductosEnCarritoService;

import java.util.List;

@RestController
@RequestMapping("/productos-en-carrito")
public class ProductosEnCarritoController {

    private final ProductosEnCarritoService productosEnCarritoService;

    @Autowired
    public ProductosEnCarritoController(ProductosEnCarritoService productosEnCarritoService) {
        this.productosEnCarritoService = productosEnCarritoService;
    }

    @GetMapping
    public ResponseEntity<List<ProductosEnCarrito>> obtenerTodosLosProductosEnCarrito() {
        List<ProductosEnCarrito> productosEnCarrito = productosEnCarritoService.obtenerTodosLosProductosEnCarrito();
        return new ResponseEntity<>(productosEnCarrito, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductosEnCarrito> guardarProductoEnCarrito(@RequestBody ProductosEnCarrito productoEnCarrito) {
        ProductosEnCarrito nuevoProductoEnCarrito = productosEnCarritoService.guardarProductoEnCarrito(productoEnCarrito);
        return new ResponseEntity<>(nuevoProductoEnCarrito, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProductoEnCarrito(@PathVariable Long id) {
        productosEnCarritoService.eliminarProductoEnCarrito(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
