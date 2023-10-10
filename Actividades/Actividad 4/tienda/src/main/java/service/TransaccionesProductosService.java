package service;

import data.TransaccionesProductos; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TransaccionesProductosRepository;

import java.util.List;

@Service
public class TransaccionesProductosService {

    private final TransaccionesProductosRepository transaccionesProductosRepository;

    @Autowired
    public TransaccionesProductosService(TransaccionesProductosRepository transaccionesProductosRepository) {
        this.transaccionesProductosRepository = transaccionesProductosRepository;
    }

    public List<TransaccionesProductos> obtenerTodosLosTransaccionesProductos() {
        return transaccionesProductosRepository.findAll();
    }

}

