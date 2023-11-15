
package junin.gob.ar.dao;

import junin.gob.ar.domain.Padron;

import java.util.List;

public interface PadronDao  {

    //lista el padron completo
    List getPadron();

    //lista el padron por mesa
    List getPadronPorMesa(Long mesas);

//    Guarda un nuevo votante en la tabla
    void guardar(Padron padron);


 //fusca un votante por el id
   List obtenerUsuarioPorId(Long idPadron);

   //List obtenerPadrondeMesa(int idMesas);

//    List<Padron> obtenerUsuarioPorId(Long idPadron);
}