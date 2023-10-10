package service;

import data.VendedorProducto; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.VendedorProductoRepository;

import java.util.List;

@Service
public class VendedorProductoService {

    private final VendedorProductoRepository vendedorProductoRepository;

    @Autowired
    public VendedorProductoService(VendedorProductoRepository vendedorProductoRepository) {
        this.vendedorProductoRepository = vendedorProductoRepository;
    }

    public List<VendedorProducto> obtenerTodosLosVendedorProductos() {
        return vendedorProductoRepository.findAll();
    }

}
