package junin.gob.ar.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "candidatos")
public class Candidatos {

    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcandidatos")
    private Long idCandidatos;

    private String apellido;

    private String nombre;

    @Column(name = "listas_idlistas")
    private int idListas;

    @Column(name = "secciones_idsecciones")
    private int idSecciones;

}