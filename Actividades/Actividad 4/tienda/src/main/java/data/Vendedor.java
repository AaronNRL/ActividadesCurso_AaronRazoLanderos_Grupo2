package data;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVendedor;

    @Column(nullable = false, unique = true)
    private String nombreTienda;

    @OneToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

}



