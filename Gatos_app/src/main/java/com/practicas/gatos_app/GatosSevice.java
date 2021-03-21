package com.practicas.gatos_app;

import com.google.gson.Gson;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alcides Blandon
 */
public class GatosSevice {

    public static void verGatitos() throws IOException {
        //1. Vamos a traer los datos de la API
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.thecatapi.com/v1/images/search")
                .method("GET", null)
                .build();

        Response response = client.newCall(request).execute();
        String elJson = response.body().string();

        //Cortar los corchetes
        elJson = elJson.substring(1, elJson.length());
        elJson = elJson.substring(0, elJson.length() - 1);

        //Crear un objeto de la clase GSON
        Gson gson = new Gson();
        Gatos gatos = gson.fromJson(elJson, Gatos.class);

        //redimensionar en caso de necesitar
        Image image = null;
        try {
            URL url = new URL(gatos.getUrl());
            image = ImageIO.read(url);

            ImageIcon fondoGato = new ImageIcon(image);

            if (fondoGato.getIconWidth() > 800) {
                //Redimensionar
                Image fondo = fondoGato.getImage();
                Image modificada = fondo.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
                fondoGato = new ImageIcon(modificada);
            }

            String menu = "opciones: "
                    + "1. Ver otra imagen\n"
                    + "2. Favoritos\n"
                    + "3. Volver al menu\n";

            String[] botones = {"ver otra imagen", "favorito", "volver"};
            String id_gato = gatos.getId();
            String opcion = (String) JOptionPane.showInputDialog(null, menu, id_gato, JOptionPane.INFORMATION_MESSAGE, fondoGato, botones, botones[0]);

            int seleccion = -1;

            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])) {
                    seleccion = i;
                }
            }

            switch (seleccion) {
                case 0:
                    verGatitos();
                    break;
                case 1:
                    favoritoGato(gatos);
                    break;
                default:
                    break;
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void favoritoGato(Gatos gatos) throws IOException {

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\r\n    \"image_id\":" + gatos.getId() + "\n}");
        Request request = new Request.Builder()
                .url("https://api.thecatapi.com/v1/favourites?Content-Type=application/json&x-api-key=50f4b7a9-2ab2-4c09-9889-f4c4e58a9ea9")
                .method("POST", body)
                .addHeader("x-api-key", gatos.getApikey())
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();

    }
    
    public static void verFavorito(String apikey) throws IOException{
        
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
          .url("https://api.thecatapi.com/v1/favourites")
          .get()
          .addHeader("Content-Type", "application/json")
          .addHeader("x-api-key", apikey)
          .build();
        Response response = client.newCall(request).execute();
        //Guardamos el String en la respuesta
        String elJson = response.body().string();

        //Creamos el objeto gson
        Gson gson = new Gson();

        GatosFav[] gatosArray = gson.fromJson(elJson, GatosFav[].class);

        if (gatosArray.length > 0) {
            int min = 1;
            int max = gatosArray.length;
            int aleatorio = (int) (Math.random() * ((max - min) - 1)) + min;
            int indice = aleatorio - 1;

            GatosFav gatoFav = gatosArray[indice];

            //redimensionar en caso de necesitar
            Image image = null;
            try {
                URL url = new URL(gatoFav.image.getUrl());
                image = ImageIO.read(url);

                ImageIcon fondoGato = new ImageIcon(image);

                if (fondoGato.getIconWidth() > 800) {
                    //Redimensionar
                    Image fondo = fondoGato.getImage();
                    Image modificada = fondo.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
                    fondoGato = new ImageIcon(modificada);
                }

                String menu = "opciones: "
                        + "1. Ver otra imagen\n"
                        + "2. Elminindar Favorito\n"
                        + "3. Volver al menu\n";

                String[] botones = {"ver otra imagen", "eliminar favorito", "volver"};
                String id_gato = gatoFav.getId();
                String opcion = (String) JOptionPane.showInputDialog(null, menu, id_gato, JOptionPane.INFORMATION_MESSAGE, fondoGato, botones, botones[0]);

                int seleccion = -1;

                for (int i = 0; i < botones.length; i++) {
                    if (opcion.equals(botones[i])) {
                        seleccion = i;
                    }
                }

                switch (seleccion) {
                    case 0:
                        verFavorito(apikey);
                        break;
                    case 1:
                        borrarFavorito(gatoFav);
                        break;
                    default:
                        break;
                }

            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    private static void borrarFavorito(GatosFav gatoFav) {
        
    }
}
