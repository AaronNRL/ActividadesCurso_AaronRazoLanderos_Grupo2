package data;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Comprador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComprador;

    @OneToOne
    @JoinColumn(name = "idUsuario", nullable = false) // idUsuario no puede ser nulo
    private Usuario usuario;

    @OneToMany(mappedBy = "comprador")
    private List<Carrito> carritos;


}


