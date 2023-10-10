package data;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class VendedorProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVendedorProducto;

    @ManyToOne
    @JoinColumn(name = "idVendedor")
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

}