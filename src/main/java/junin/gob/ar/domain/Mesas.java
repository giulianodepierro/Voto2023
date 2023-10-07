package junin.gob.ar.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


@Data 
@Entity    
@Table(name = "mesas") 
public class Mesas implements Serializable{

     private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmesas;
    
    @NotEmpty
   private  int numero_mostrar;
    
    @NotEmpty
    private int secciones_idsecciones;
    
}
