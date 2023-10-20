package junin.gob.ar.domain;

import java.io.Serializable;
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
    

    private String dni_numero;
    private int es_agregado;


    private  int dni_tipo;
    private int mesas_idmesas;


//    @OneToOne
//    @JoinColumn(name =  "mesas_idmesas")
//    private  Mesas  mesas;
//
//    @OneToOne
//    @JoinColumn(name = "dni_tipo")
//
//    private  TipoDocumento tipoDocumento;

    public Long getIdpadron() {
        return idpadron;
    }

    public void setIdpadron(Long idpadron) {
        this.idpadron = idpadron;
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

    public int getDni_tipo() {
        return dni_tipo;
    }

    public void setDni_tipo(int dni_tipo) {
        this.dni_tipo = dni_tipo;
    }

    public String getDni_numero() {
        return dni_numero;
    }

    public void setDni_numero(String dni_numero) {
        this.dni_numero = dni_numero;
    }

    public int getEs_agregado() {
        return es_agregado;
    }

    public void setEs_agregado(int es_agregado) {
        this.es_agregado = es_agregado;
    }


    public int getMesas_idmesas() {
        return mesas_idmesas;
    }

    public void setMesas_idmesas(int mesas_idmesas) {
        this.mesas_idmesas = mesas_idmesas;
    }
}
