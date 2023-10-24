package junin.gob.ar.web;


import junin.gob.ar.domain.Candidatos;
import junin.gob.ar.domain.Padron;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControlaorCandidatos {

    @GetMapping("/editarCanidatos")
    public String editar(Candidatos candidatos){
        //var  padron1 = padronDao.obtenerUsuarioPorId((idPadron));
        //model.addAttribute("padron", padron1);
        return "agregarCandidatos";
    }
}
