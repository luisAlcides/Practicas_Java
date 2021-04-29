package FirstElements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsiganarPropiedadesDelSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(p);
            //System.getProperties().list(System.out);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"...\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            ps.list(System.out);
        } catch (Exception e) {
            System.out.println("El archvio no Existe = " + e);
        }

    }
}
