package junin.gob.ar.dao;

import junin.gob.ar.domain.Autoridad;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
;
import java.util.List;

@Repository
@Transactional
public class AutoridadDaoImpl implements AutoridadDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List getAutoridades() {
        String query = "FROM Autoridad";
        List<Autoridad> lista = entityManager.createQuery(query).getResultList();

        return lista;
    }
}