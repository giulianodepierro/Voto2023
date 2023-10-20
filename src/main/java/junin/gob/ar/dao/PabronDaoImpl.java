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
        String query= "FROM Padron";
        List<Padron> lista = entityManager.createQuery(query).getResultList();

        return lista;
    }



    @Transactional(readOnly = false)
    public void guardar(Padron padron) {
        entityManager.merge(padron);
    }

    @Override
    public List<Padron> obtenerUsuarioPorId(Long idpadron) {
        String query = "FROM Padron WHERE idpadron = :idpadron";
        List<Padron> lista = entityManager.createQuery(query, Padron.class)
                .setParameter("idpadron", idpadron)
                .getResultList();
        return lista;
    }


//
//       @Override
//           public Padron obtenerUsuarioPorId() {
//           String query = "FROM Padron WHERE idpadron = :idPadron";
//           List<Padron> lista = entityManager.createQuery(query)
//                   .setParameter("idpadron", padron.getIdpadron())
//                   .getResultList();
//
//           if (lista.isEmpty()) {
//           }
//           return lista.get(0) ;
//       }
//               return null;

}
