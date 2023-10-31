package junin.gob.ar.dao;

import junin.gob.ar.domain.Autoridad;

import java.util.List;

public interface AutoridadDao {
    List getAutoridades();

    Autoridad buscarAutoridadUsuarioClave(String usuario, String clave);
}
