package service;

import data.ProductosCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductosCarritoRepository;

import java.util.List;

@Service
public class ProductosCarritoService {

    private final ProductosCarritoRepository productosCarritoRepository;

    @Autowired
    public ProductosCarritoService(ProductosCarritoRepository productosCarritoRepository) {
        this.productosCarritoRepository = productosCarritoRepository;
    }

    public List<ProductosCarrito> obtenerTodosLosProductosCarrito() {
        return productosCarritoRepository.findAll();
    }

    public ProductosCarrito guardarProductoCarrito(ProductosCarrito productoCarrito) {
        return productosCarritoRepository.save(productoCarrito);
    }

    public void eliminarProductoCarrito(Long id) {
        productosCarritoRepository.deleteById(id);
    }

}

