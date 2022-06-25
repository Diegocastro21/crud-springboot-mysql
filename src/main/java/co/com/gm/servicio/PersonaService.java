package co.com.gm.servicio;

import co.com.gm.domain.Persona;

import java.util.List;

public interface PersonaService {


    /**
     * En esta interfaz se declaran los metodos para
     * el crud que se va  utilizar
     * listarPersonas
     * Guardar
     * eliminar
     * encotrarPersona
     *
     * @return
     */
    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);



}
