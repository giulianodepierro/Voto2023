package junin.gob.ar.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "padron")
public class Padron implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpadron;
    
    @NotEmpty // esta anotacion sirve para validar que el campo nombre no sea nulo
    private String nombre;
    @NotEmpty
    private String apellido;
    

    @NotEmpty
    private String dni_numero;    
    @NotEmpty
    private int es_agregado;


//    @OneToOne
//    @JoinColumn(name =  "mesas_idmesas")
//    private  Mesas  mesas;
//
//    @OneToOne
//    @JoinColumn(name = "dni_tipo")
//
//    private  TipoDocumento tipoDocumento;

}
