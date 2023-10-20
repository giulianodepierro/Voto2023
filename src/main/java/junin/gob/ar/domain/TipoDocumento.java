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

    public Long getIddoc() {
        return iddoc;
    }

//    public void setIddoc(Long iddoc) {
//        this.iddoc = iddoc;
//    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getAbreviada() {
        return abreviada;
    }

    public void setAbreviada(String abreviada) {
        this.abreviada = abreviada;
    }
}
