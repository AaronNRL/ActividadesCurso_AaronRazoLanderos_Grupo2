package data;

import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
public class Transacciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaccion;

    @ManyToOne
    @JoinColumn(name = "idComprador", nullable = false) // idComprador no puede ser nulo
    private Comprador comprador;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;

    private double montoTotal;

    @Column(nullable = false) // Direccion de envío no puede ser nula
    private String direccionEnvio;

}

