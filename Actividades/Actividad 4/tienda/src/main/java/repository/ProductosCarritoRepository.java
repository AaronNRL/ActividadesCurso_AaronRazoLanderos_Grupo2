package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import data.ProductosCarrito;

@Repository
public interface ProductosCarritoRepository extends JpaRepository<ProductosCarrito, Long> {

}
