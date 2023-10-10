
package junin.gob.ar.dao;

import junin.gob.ar.domain.Padron;

import java.util.List;

public interface PadronDao  {


    List getPadron();




//    List obtenerUsuarioPorId(Long idPadron);

    List<Padron> obtenerUsuarioPorId(Long idPadron);
}