package junin.gob.ar.dao;

import junin.gob.ar.domain.Padron;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class PabronDaoImpl implements  PadronDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getPadron(){
        String query= " FROM Padron";
        List<Padron> lista = entityManager.createQuery(query, Padron.class).getResultList();
        return lista;
    }




    public void guardar(Padron padron) {
        entityManager.merge(padron);
    }

    @Override
    public List<Padron> obtenerUsuarioPorId(Long idPadron) {
        String query = "FROM Padron WHERE idPadron = :idpadron";
        List<Padron> lista = entityManager.createQuery(query, Padron.class)
                .setParameter("idpadron", idPadron)
                .getResultList();
        return lista;
    }
//

}
