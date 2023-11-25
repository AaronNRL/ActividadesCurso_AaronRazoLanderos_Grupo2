package service;

import data.Transacciones; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TransaccionesRepository;

import java.util.List;

@Service
public class TransaccionesService {

    private final TransaccionesRepository transaccionesRepository;

    @Autowired
    public TransaccionesService(TransaccionesRepository transaccionesRepository) {
        this.transaccionesRepository = transaccionesRepository;
    }

    public List<Transacciones> obtenerTodasLasTransacciones() {
        return transaccionesRepository.findAll();
    }

}
