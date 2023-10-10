package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import data.ProductosEnCarrito;

@Repository
public interface ProductosEnCarritoRepository extends JpaRepository<ProductosEnCarrito, Long> {

}


