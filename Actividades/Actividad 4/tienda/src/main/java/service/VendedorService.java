package service;

import data.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.VendedorRepository;

import java.util.List;

@Service
public class VendedorService {

    private final VendedorRepository vendedorRepository;

    @Autowired
    public VendedorService(VendedorRepository vendedorRepository) {
        this.vendedorRepository = vendedorRepository;
    }

    public List<Vendedor> obtenerTodosLosVendedores() {
        return vendedorRepository.findAll();
    }

}
