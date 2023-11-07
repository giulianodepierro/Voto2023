package junin.gob.ar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

//version 1.2 desarrollo ( ej 21)
        //tabla padron mapeada  
        //23/05/2023 se agregaron las funciones Agregar, Modificar y eliminar Registros de la tabla padron 
        //version 1.3 desarrolo
        //se agregaron validaciones en el formulario de agregar/modificar padron
        //version 1.4 desarrollo 
       //se mapeo la tabla mesa y 
       //version 1.5 desarrollo
       //mapeo tabla seeciones con error
@SpringBootApplication
@EntityScan
public class VotoElectronicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotoElectronicoApplication.class, args);
	}

}
