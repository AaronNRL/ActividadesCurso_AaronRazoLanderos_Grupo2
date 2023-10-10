package data;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
public class Categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorias;

    @Column(nullable = false) // El nombre de la categoría no puede ser nulo
    private String nombreCategoria;

    private String descripcionCategoria;

    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false) // idProducto no puede ser nulo
    private Producto producto;

}
