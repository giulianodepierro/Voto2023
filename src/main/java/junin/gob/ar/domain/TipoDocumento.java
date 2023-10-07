package junin.gob.ar.domain;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "util_tipodocumento")
public class TipoDocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipodoc")
    private Long iddoc;

    @NotEmpty
    @Column(name = "denominacion")
    private  String  detalle;

    @NotEmpty
    @Column(name = "abreviada")
    private String abreviada;
}
