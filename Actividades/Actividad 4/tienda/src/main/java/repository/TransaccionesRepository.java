package repository;

import data.Transacciones; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionesRepository extends JpaRepository<Transacciones, Long> {

}

