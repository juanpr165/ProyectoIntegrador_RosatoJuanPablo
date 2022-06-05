
package com.portfolio.jpr.Interface;

import com.portfolio.jpr.Entity.Persona;
import java.util.List;

/**
 *
 * @author juanp
 */
public interface IPersonaService {
    // Traer lista de personas
    public List<Persona>getPersonas();
    
    //Guardar un objeto persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto peto lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
    
}
