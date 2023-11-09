
package junin.gob.ar.dao;

import junin.gob.ar.domain.Padron;

import java.util.List;

public interface PadronDao  {


    List getPadron();

    void guardar(Padron padron);



   List obtenerUsuarioPorId(Long idPadron);

   List obtenerPadrondeMesa(int idMesas);

//    List<Padron> obtenerUsuarioPorId(Long idPadron);
}