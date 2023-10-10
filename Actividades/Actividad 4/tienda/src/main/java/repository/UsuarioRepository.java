package repository;

import data.Usuario; // Asegúrate de que la ubicación del paquete sea la correcta
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}