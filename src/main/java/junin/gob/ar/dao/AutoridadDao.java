package junin.gob.ar.dao;

import junin.gob.ar.domain.Autoridad;

import java.util.List;

public interface AutoridadDao {

    //lista todas las autoriadades
    List getAutoridades();

    //devuelte obj Autoridad buscado por usuario y clave;
    Autoridad buscarAutoridadUsuarioClave(String usuario, String clave);

    Long obtenerIdMesas(String usuario, String clave);

    int obtenerIdSecciones(String usuario, String clave);


    //esta funcion guarda el id e la mesa

}
