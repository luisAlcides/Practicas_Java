package test;

import static datos.Conexion.getConnection;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;

public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);

            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Karla Ivone");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("karla@gmail.com");
            cambioPersona.setTelefono("87451269");
            personaJDBC.Update(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            nuevaPersona.setApellido("Ramirez");
            personaJDBC.insertar(nuevaPersona);

            conexion.commit();
            System.out.println("Se ha hecho el commit");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
}
