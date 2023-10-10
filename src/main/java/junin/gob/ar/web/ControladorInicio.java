package junin.gob.ar.web;

//import javax.validation.Valid;

//import junin.gob.ar.servicio.PadronService;
import junin.gob.ar.dao.PadronDao;
import junin.gob.ar.domain.Padron;
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


    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/index")
    public String hola(Model model) {


        var padrones = padronDao.getPadron();
        model.addAttribute("padrones", padrones);

  //             model.addAttribute("padron1", padron1);
//            var tipo =dniDao.getDniTipo();
//            model.addAttribute("tipo",tipo);

        return "index";

    }

    @GetMapping("/modificar")
    public String buscar(@RequestParam("idpadron") Long idpadron, Model model) {

        var padron1 = padronDao.obtenerUsuarioPorId((idpadron));
        model.addAttribute("padron1", padron1);
    return "modificar";
    }
}