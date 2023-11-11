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

// Limpia la caché de JPA (EntityManager)

private  AutoridadDao autoridadDao;
    @Override
    public List getPadron(){

        String query= " FROM Padron";
        List<Padron> lista = entityManager.createQuery(query, Padron.class).getResultList();
       return lista;
    }


    @Override
    public List getPadronPorMesa(Long mesas){

        String query= " FROM Padron WHERE mesas.idmesas = :idMesa";
        List<Padron> lista = entityManager.createQuery(query, Padron.class)
                .setParameter("idMesa", mesas)
                .getResultList();
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
//listar mesas por id mesas obenidas segun quien se lolega

    public List<Padron> obtenerPadrondeMesa(int idMesas ){
        String query = "FROM Padron WHERE mesa = : idMesas";
        List <Padron> lista = entityManager.createQuery(query, Padron.class)
                .setParameter("idMesas", idMesas)
                .getResultList();
        return lista;
    }

}
