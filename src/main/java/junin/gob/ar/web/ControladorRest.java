package junin.gob.ar.web;

import junin.gob.ar.dao.PadronDao;
import junin.gob.ar.domain.Padron;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
public class ControladorRest {

    @Autowired
    private PadronDao padronDao;
    @RequestMapping(value = "api/padron")
    public List<Padron> getVistaPadron(){
        return padronDao.getPadron();
    }
}


