package data;

import jakarta.persistence.*;

@Entity
public class TransaccionesProductos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaccionProducto;

    @ManyToOne
    @JoinColumn(name = "idTransaccion")
    private Transacciones transaccion;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

    private int cantidad;

}
