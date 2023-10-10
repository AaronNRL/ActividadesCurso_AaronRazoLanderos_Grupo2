package data;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class ProductosEnCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProductosEnCarrito;

    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idCarrito", nullable = false)
    private Carrito carrito;

}

