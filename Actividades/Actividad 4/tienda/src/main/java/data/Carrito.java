package data;

import jakarta.persistence.*;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrito;

    @ManyToOne
    @JoinColumn(name = "idComprador", nullable = false) // idComprador no puede ser nulo
    private Comprador comprador;

}

