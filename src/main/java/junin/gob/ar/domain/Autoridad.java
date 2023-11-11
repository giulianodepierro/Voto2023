package junin.gob.ar.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "autoridades")
public class Autoridad {

    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idautoridades")
    private Long idAutoridad;

    private String nombre;

    private String usuario;

    @Column (name = "superusuario")
    private String superUsuario;

    @Column ( name = "clave_super")
    private String claveSuper;
    @Column (name = "clave_usuario")
    private String claveUsuario;

    @ManyToOne
    @JoinColumn(name = "mesas_idmesas")
    private Mesas mesas;



}
