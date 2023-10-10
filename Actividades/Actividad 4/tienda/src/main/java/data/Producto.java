package data;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    private String nombre;

    private String descripcion;

    private double precio;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categorias categoria;

    private String detallesProducto;

}

