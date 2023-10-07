
package junin.gob.ar.servicio;

import java.util.List;
import junin.gob.ar.dao.MesasDao;
import junin.gob.ar.domain.Mesas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MesasServiceImpl implements MesasService{
    
    @Autowired
    private  MesasDao mesasDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Mesas> listarMesas(){
        return (List<Mesas>) mesasDao.findAll();
        
    }
}
