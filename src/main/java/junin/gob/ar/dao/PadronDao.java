
package junin.gob.ar.dao;

import junin.gob.ar.domain.Mesas;
import junin.gob.ar.domain.Padron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PadronDao  {


    List getPadron();


}