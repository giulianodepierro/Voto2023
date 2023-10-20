package junin.gob.ar.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class TipoDocumentoDaoImpl implements  TipoDocumentoDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List getTipoDoc() {
        String query = "FROM TipoDocumento";
        List<TipoDocumentoDao> lista = entityManager.createQuery(query).getResultList();

        return lista;
    }

}
