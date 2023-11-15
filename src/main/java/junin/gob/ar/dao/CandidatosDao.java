package junin.gob.ar.dao;

import java.util.List;

public interface CandidatosDao {
    List getCandidatos();

    List getCandidatosPorSeccion(Long seccion);
}
