package junin.gob.ar.dao;

import junin.gob.ar.domain.Padron;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class PabronDaoImpl implements  PadronDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getPadron(){
        String query= "FROM Padron";
        return entityManager.createQuery(query).getResultList();
    }

}
