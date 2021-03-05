package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {

        PersonaDAO personaDAO = new PersonaDAO();

        //Insertando un nuevo objeto de tipo Persona
        Persona personaNueva = new Persona("Carlos", "Esparza", "carlos@gmail.com", "87456231");
        personaDAO.insertar(personaNueva);

        //Modificando Datos 
        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcerlos@gmail.co", "87456231");
        personaDAO.Update(personaModificar);
        
        //Eliminar Datos
        Persona personaEliminar = new Persona(4);
        personaDAO.delete(personaEliminar);
        
        List<Persona> personas = personaDAO.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }
}
