// package junin.gob.ar.servicio;
//
//import java.util.List;
//import junin.gob.ar.dao.PadronDao;
//import junin.gob.ar.domain.Padron;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class PadronServiceImpl implements PadronService{
//
//    @Autowired
//    private PadronDao padronDao;
//
//    @Override
//    @Transactional(readOnly= true)
//    public List<Padron> listarPadron() {
//
//        return List<Padron>;
//    }
//
//    @Override
//    @Transactional //(hace commit o rollbak)
//    public void guardar(Padron padron) {
//        padronDao.save(padron);
//    }
//
//    @Override
//    @Transactional
//    public void eliminar(Padron padron) {
//        padronDao.delete(padron);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public Padron encontrarPadron(Padron padron) {
//        return padronDao.findById(padron.getIdpadron()).orElse(null);
//
//    }
//
//}
