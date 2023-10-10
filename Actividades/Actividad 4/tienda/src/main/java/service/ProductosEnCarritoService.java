package service;

import data.ProductosEnCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductosEnCarritoRepository;

import java.util.List;

@Service
public class ProductosEnCarritoService {

    private final ProductosEnCarritoRepository productosEnCarritoRepository;

    @Autowired
    public ProductosEnCarritoService(ProductosEnCarritoRepository productosEnCarritoRepository) {
        this.productosEnCarritoRepository = productosEnCarritoRepository;
    }

    public List<ProductosEnCarrito> obtenerTodosLosProductosEnCarrito() {
        return productosEnCarritoRepository.findAll();
    }

    public ProductosEnCarrito guardarProductoEnCarrito(ProductosEnCarrito productoEnCarrito) {
        return productosEnCarritoRepository.save(productoEnCarrito);
    }

    public void eliminarProductoEnCarrito(Long id) {
        productosEnCarritoRepository.deleteById(id);
    }

    // Otros métodos de servicio relacionados con ProductosEnCarrito
}

