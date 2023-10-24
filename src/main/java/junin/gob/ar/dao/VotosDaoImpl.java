package junin.gob.ar.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import junin.gob.ar.domain.Padron;
import junin.gob.ar.domain.Votos;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class VotosDaoImpl implements VotosDao{

    @PersistenceContext
    private EntityManager entityManager;


    public List getVotos(){
        String query= "FROM Votos";
        List<Votos> lista = entityManager.createQuery(query).getResultList();

        return lista;
    }
    @Transactional(readOnly = false)
    public void votar(Votos votos){
        entityManager.merge(votos);
    }

}
