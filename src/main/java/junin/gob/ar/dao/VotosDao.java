package junin.gob.ar.dao;

import junin.gob.ar.domain.Votos;

import java.util.List;

public interface VotosDao {

    void votar(Votos votos);

    List<Votos> getVotos();

    Long getCantVotos();
}
