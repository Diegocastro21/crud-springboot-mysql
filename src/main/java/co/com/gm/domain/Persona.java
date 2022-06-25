package co.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable{


    /**
     * Esta clase es la modelo representativo
     * de la clase persona en la base de datos mysql
     * @Entity
     * y cuenta con todos sus atributos
     * y metodos proporcionados por Lombok mediante la
     * anotacion @Data
     * tambien hacemos uso de las validaciones
     * para que no puedan estar vacios
     * y en el caso de el email este sea valido cuente
     * con @.
     */


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellido;

    @NotEmpty
    @Email
    private String email;

    private String telefono;
}
