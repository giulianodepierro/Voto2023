package junin.gob.ar.web;

import junin.gob.ar.dao.CandidatosDao;
import junin.gob.ar.dao.VotosDao;
import junin.gob.ar.domain.Votos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class ControladorVotos {

    @Autowired
    public ControladorVotos(VotosDao votosDao) {
        this.votosDao = votosDao;
    }

    @Autowired
    private VotosDao votosDao;

    @Autowired
    CandidatosDao candidatosDao;
    @GetMapping("/voto")
    public String mostrarCandidatos(Model model, Votos votos) {

        var candidatos = candidatosDao.getCandidatos();
        model.addAttribute("candidatos", candidatos);

        return "voto";
    }

    @GetMapping("/conteo")
    public String contarVotos(Model model, Votos votos) {
        var contadorVotos = votosDao.getCantVotos();
        model.addAttribute("cantVotos", contadorVotos);
        return "conteo";
    }

    @GetMapping("/emitirVoto")
    public String agregarVoto(@RequestParam int idCandidatos, @RequestParam int cantidadVotos) {
        // Crear un objeto Votos con idCandidatos=1 y cantidadVotos=1
        Votos votos = new Votos();
        votos.setIdCandidatos(idCandidatos);
        votos.setCantidadVotos(cantidadVotos);

        // Llamar al método votar en el DAO para agregar el registro en la base de datos
        votosDao.votar(votos);
        return "index";
    }
}
