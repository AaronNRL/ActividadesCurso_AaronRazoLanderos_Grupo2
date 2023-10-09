package repository;

import data.TransaccionesProductos; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionesProductosRepository extends JpaRepository<TransaccionesProductos, Long> {

}

