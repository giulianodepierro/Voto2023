package junin.gob.ar.domain;

import javax.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "votos")
public class Votos implements Serializable {

    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvotos")
    private Long idVotos;

    @Column(name = "candidatos_idcandidatos")
    private int idCandidatos;

    @Column(name = "cantidad_votos")
    private int cantidadVotos;

    public Long getIdVotos() {
        return idVotos;
    }

//    public void setIdVotos(Long idVotos) {
//        this.idVotos = idVotos;
//    }

    public int getIdCandidatos() {
        return idCandidatos;
    }

    public void setIdCandidatos(int idCandidatos) {
        this.idCandidatos = idCandidatos;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
}