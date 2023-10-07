package junin.gob.ar.web;

//import javax.validation.Valid;

//import junin.gob.ar.servicio.PadronService;
import junin.gob.ar.dao.PadronDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PadronDao padronDao;


    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/index")
    public String hola(Model model) {

        int dniTipo = 1;

        model.addAttribute("mensaje", "Hola desde thymeleaf");
        model.addAttribute("dni", dniTipo);

        var padrones = padronDao.getPadron();
        model.addAttribute("padrones", padrones);

//            var tipo =dniDao.getDniTipo();
//            model.addAttribute("tipo",tipo);

        return "index";

    }
}