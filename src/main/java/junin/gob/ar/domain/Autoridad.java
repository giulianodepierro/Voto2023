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

    @Column (name = "clave_super")
    private String claveSuper;
    @Column (name = "clave_usuario")
    private String claveUsuario;

    @Column (name = "mesa_idmesa")
    private int idMesas;

    public Long getIdAutoridad() {
        return idAutoridad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSuperUsuario() {
        return superUsuario;
    }

    public void setSuperUsuario(String superUsuario) {
        this.superUsuario = superUsuario;
    }

    public String getClaveSuper() {
        return claveSuper;
    }

    public void setClaveSuper(String claveSuper) {
        this.claveSuper = claveSuper;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public int getIdMesas() {
        return idMesas;
    }

    public void setIdMesas(int idMesas) {
        this.idMesas = idMesas;
    }
}
