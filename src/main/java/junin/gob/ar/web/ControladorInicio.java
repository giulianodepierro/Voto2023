package junin.gob.ar.web;

//import javax.validation.Valid;

//import junin.gob.ar.servicio.PadronService;
import junin.gob.ar.dao.CandidatosDao;
import junin.gob.ar.dao.PadronDao;
import junin.gob.ar.dao.TipoDocumentoDao;
import junin.gob.ar.dao.VotosDao;
import junin.gob.ar.domain.Padron;
import junin.gob.ar.domain.Votos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PadronDao padronDao;
    @Autowired
    private CandidatosDao candidatosDao;
    @Autowired
    private TipoDocumentoDao tipoDocumentoDao;

//    @Autowired
//    public ControladorInicio(VotosDao votosDao) {
//        this.votosDao = votosDao;
//    }

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/agregar")
    public String agregar(Model model, Padron padron){
        var tiposDoc  = tipoDocumentoDao.getTipoDoc();
        model.addAttribute("tiposDoc", tiposDoc);
        return "agregarPersona";
    }

    @GetMapping("/index")
    public String hola(Model model) {
        var padrones = padronDao.getPadron();
        model.addAttribute("padrones", padrones);
        return "index";
    }

//    @GetMapping("/voto")
//    public String mostrarCandidatos(Model model, Votos votos) {
//        var candidatos = candidatosDao.getCandidatos();
//   model.addAttribute("candidatos", candidatos);
////    votosDao.votar(votos);
//        return "voto";
//    }
    @GetMapping("/modificar")
    public String buscar(@RequestParam("idpadron") Long idpadron, Model model) {

        var padron1 = padronDao.obtenerUsuarioPorId((idpadron));
        model.addAttribute("padron1", padron1);
    return "modificar";
    }

    @GetMapping("/editar")
    public String editar(Padron padron,Long idPadron, Model model){
      var  padron1 = padronDao.obtenerUsuarioPorId((idPadron));
        model.addAttribute("padron", padron1);
        return "agregarPersona";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Padron padron){
        padronDao.guardar(padron);
        return "index";
    }

}
