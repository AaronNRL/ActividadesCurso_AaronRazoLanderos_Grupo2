package data;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class ComentariosResenas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComentario;

    private String comentarioTexto;

    private int calificacion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;

    @ManyToOne
    @JoinColumn(name = "idComprador")
    private Comprador comprador;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

}
