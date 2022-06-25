package co.com.gm.dao;

import co.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

    /*
    * simple interfaz que extiende de CrudRepository
    * la cual coje la entidad Persona y su Long el cual
    * representa a su Identificador
    * */

}
