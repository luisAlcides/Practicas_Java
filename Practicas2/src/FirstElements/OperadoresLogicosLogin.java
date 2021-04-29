package FirstElements;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "luis";
        String password = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String u = sc.nextLine();

        System.out.println("Ingrese el password");
        String p = sc.nextLine();

        boolean esAunteticado = false;

        if(username.equals(u) && password.equals(p)){
            esAunteticado = true;
        }

        if(esAunteticado){
            System.out.println("Bienvenido usuario: " + username);
        }else{
            System.out.println("Username y contraseña incorrectos");

        }
    }
}
