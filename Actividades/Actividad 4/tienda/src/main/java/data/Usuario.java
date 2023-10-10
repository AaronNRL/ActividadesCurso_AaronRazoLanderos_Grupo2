package data;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "Nombre_Usuario")
    private String nombreUsuario;

    private String contraseña;

    @Column(name = "Correo_Electronico", unique = true)
    private String correoElectronico;

    @Enumerated(EnumType.STRING)
    @Column(name = "Tipo_Usuario")
    private TipoUsuario tipoUsuario;

}
