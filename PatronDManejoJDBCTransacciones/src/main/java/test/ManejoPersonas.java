package test;

import static datos.Conexion.getConnection;
import datos.PersonaDAO;
import datos.PersonaDAOJDBC;
import domain.PersonaDTO;
import java.sql.*;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaDAO personaDAO = new PersonaDAOJDBC(conexion);

            List<PersonaDTO> personas = personaDAO.select();
            
            personas.forEach(persona -> {
                System.out.println("Persona DTO: " + persona);
            });
                    

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
