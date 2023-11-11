package junin.gob.ar.web;

import junin.gob.ar.dao.AutoridadDao;
import junin.gob.ar.dao.CandidatosDao;
import junin.gob.ar.dao.PadronDao;

import junin.gob.ar.dao.VotosDao;
import junin.gob.ar.domain.Autoridad;
import junin.gob.ar.domain.Padron;
import junin.gob.ar.domain.Votos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
@Slf4j
public class ControladorRest {

    @Autowired
    private PadronDao padronDao;

    @Autowired
    private CandidatosDao candidatosDao;
    @Autowired
    private VotosDao votosDao;
    @Autowired
    private AutoridadDao autoridadDao;

    @RequestMapping(value = "api/padron")
    public List<Padron> getVistaPadron(){

    return padronDao.getPadron();
    }


    @RequestMapping(value = "padron-mesa")
    public List<Padron> obtenerPadronPorMesa(){
        Long mesa = autoridadDao.obtenerIdMesas("usuario2","user22");
        return padronDao.getPadronPorMesa(mesa);
    }
    @RequestMapping(value = "api/candidatos")
    public List<Padron> getVistaCandidatos(){

        return candidatosDao.getCandidatos();
    }
    @RequestMapping(value = "api/votos")
    public List<Votos> getVistaVotos(){
        return votosDao.getVotos();
    }
    @RequestMapping(value = "autoridades")
    public List<Autoridad> getVistaAutoridades(){
        return autoridadDao.getAutoridades();
    }

    @RequestMapping(value = "autoridad")
    public Autoridad getVistaAutoridad(){

        return  autoridadDao.buscarAutoridadUsuarioClave("usuario1","user11");
    }

    @RequestMapping(value = "votosCantidad")
    public Long cantVotos(){
        return votosDao.getCantVotos();
    }

}


