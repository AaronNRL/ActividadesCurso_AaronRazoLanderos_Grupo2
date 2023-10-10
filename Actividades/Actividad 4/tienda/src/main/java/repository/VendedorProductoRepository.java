package repository;

import data.VendedorProducto; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorProductoRepository extends JpaRepository<VendedorProducto, Long> {

}
