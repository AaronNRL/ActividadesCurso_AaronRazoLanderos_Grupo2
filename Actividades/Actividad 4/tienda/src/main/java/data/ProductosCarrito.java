package data;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ProductosCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrito;

    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

}

