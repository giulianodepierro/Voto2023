
package junin.gob.ar.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table (name = "secciones")
public class Secciones implements Serializable {
    
    private static  final Long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsecciones;
    
    
    private String seccion; 
    
}
