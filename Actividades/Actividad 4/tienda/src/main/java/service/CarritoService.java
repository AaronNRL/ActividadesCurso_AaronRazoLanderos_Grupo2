package service;

import data.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CarritoRepository;

import java.util.List;

@Service
public class CarritoService {

    private final CarritoRepository carritoRepository;

    @Autowired
    public CarritoService(CarritoRepository carritoRepository) {
        this.carritoRepository = carritoRepository;
    }

    public List<Carrito> obtenerTodosLosCarritos() {
        return carritoRepository.findAll();
    }

}

