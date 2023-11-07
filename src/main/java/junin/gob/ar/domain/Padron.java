package junin.gob.ar.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name = "padron")
public class Padron implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long idpadron;

    @NotEmpty // esta anotacion sirve para validar que el campo nombre no sea nulo
    private String nombre;
    private String apellido;

    @Column(name = "dni_numero")
    private String dniNumero;

    @Column(name = "es_agregado")
    private int agregado;


    @Column(name = "mesas_idmesas")
    private int mesa;



    @JoinColumn(name = "id") // Asegúrate de que coincida con el nombre de la columna en la tabla de TipoDocumento
    private TipoDocumento tipoDocumento;


    public Long getIdpadron() {
        return idpadron;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDniNumero() {
        return dniNumero;
    }

    public void setDniNumero(String dniNumero) {
        this.dniNumero = dniNumero;
    }

    public int getAgregado() {
        return agregado;
    }

    public void setAgregado(int agregado) {
        this.agregado = agregado;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }


}
