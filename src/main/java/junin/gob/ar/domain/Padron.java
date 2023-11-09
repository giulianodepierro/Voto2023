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

    private Long idpadron;

    private String nombre;
    private String apellido;

    @ManyToOne


    @JoinColumn(name = "dni_tipo")
    private  TipoDocumento tipoDocumento;

    @Column(name = "dni_numero")
    private String dniNumero;

    @ManyToOne
    @JoinColumn(name = "mesas_idmesas")
    private Mesas mesas;

    @Column(name = "es_agregado")
    private int agregado;
    }