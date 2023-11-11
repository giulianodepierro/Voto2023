package junin.gob.ar.web;

//import javax.validation.Valid;

//import junin.gob.ar.servicio.PadronService;
import junin.gob.ar.dao.*;
import junin.gob.ar.domain.Autoridad;
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

    //estas dos variables van a guardar el usuario toda la sesion
       public String sesionUsuario;
   public String sesionClave;
   public int mesaAutoridad;

    @Autowired
    private PadronDao padronDao;
    @Autowired
    private CandidatosDao candidatosDao;
    @Autowired
    private TipoDocumentoDao tipoDocumentoDao;
    @Autowired
    private AutoridadDao autoridadDao;
    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/verPadron")
    public String agregar(Model model){
        var padrones= padronDao.getPadron();
        model.addAttribute("padrones", padrones);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Model model, Padron padron){
        var tiposDoc  = tipoDocumentoDao.getTipoDoc();
        model.addAttribute("tiposDoc", tiposDoc);
        return "agregarPersona";
    }

    @PostMapping("/index")
    public String hola(Model model, @RequestParam String usuario, @RequestParam String clave) {

        Autoridad usuarioLogeo= autoridadDao.buscarAutoridadUsuarioClave(usuario,clave);
         mesaAutoridad= usuarioLogeo.getIdMesas();
        System.out.println("mesaAutoridad: " + mesaAutoridad);
        sesionClave = clave;
        sesionUsuario=usuario;

        if ( usuarioLogeo.getUsuario().equals(sesionUsuario) &&  usuarioLogeo.getClaveUsuario().equals(sesionClave)) {
         var padrones = padronDao.getPadron();

        model.addAttribute("padrones", padrones);
        return "nuevoIndex";

        } else {
            return "login";
        }
    }



    @GetMapping("/inicio")
    public String volver() {
       return "nuevoIndex";
    }
    @GetMapping("/editar")
    public String editar(Padron padron,Long idPadron, Model model){
        var  padron1 = padronDao.obtenerUsuarioPorId((idPadron));
        model.addAttribute("padron", padron1);
        return "agregarPersona";
    }
    @GetMapping("/modificar")
    public String buscar(@RequestParam("idpadron") Long idpadron, Model model) {

        var padron1 = padronDao.obtenerUsuarioPorId((idpadron));
        model.addAttribute("padron1", padron1);
    return "modificar";
    }




    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Padron padron){
        padronDao.guardar(padron);
        return "index";
    }


    @GetMapping("/login")
    public String agregarVoto(@RequestParam String usuario, @RequestParam String clave) {
        if (usuario == "alejo" && clave == "ale") {
            // Llamar al método votar en el DAO para agregar el registro en la base de datos

            return "index";
        } else {
            return "login";
        }
    }

    @GetMapping("/bs")
    public String probarLogin() {
        return  "loginBostrap";
    }
}
