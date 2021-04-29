package POO.abstractas.form;

import POO.abstractas.form.elementos.*;
import POO.abstractas.form.elementos.select.Opcion;
import POO.abstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
        .addValidador(new LargoValidador(6,12));
        
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
        .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "Javascript").setSelected(true));

        ElementosForm saludar = new ElementosForm("saludar"){
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value='"+this.valor+"'>";
            }
        };

        saludar.setValor("Hola que tal este campo esta desabilitado");
        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("joh.d@gmail.com");
        edad.setValor("21");
        experiencia.setValor("....... mas de 10 años de experiencia");


        List<ElementosForm> elementos = Arrays.asList(username, password,
                email, edad, experiencia, lenguaje, saludar);


        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
           if(!e.esValido()){
               e.getErrores().forEach(System.out::println);
           }
        });

    }
}
