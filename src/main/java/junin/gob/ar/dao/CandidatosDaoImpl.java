package junin.gob.ar.dao;

import junin.gob.ar.domain.Candidatos;
import junin.gob.ar.domain.Padron;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class CandidatosDaoImpl implements  CandidatosDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getCandidatos() {
        String query = "FROM Candidatos";
        List<Padron> lista = entityManager.createQuery(query).getResultList();

        return lista;
    }

    @Override
    public List getCandidatosPorSeccion(Long seccion) {

        String query = "FROM Candidatos WHERE secciones.idsecciones= :seccion";
        List<Candidatos> lista = entityManager.createQuery(query, Candidatos.class)
        .setParameter("seccion", seccion)
                .getResultList();


        return lista;
    }
    public void guardar(Padron padron) {
        entityManager.merge(padron);
    }
}