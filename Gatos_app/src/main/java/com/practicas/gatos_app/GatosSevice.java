package com.practicas.gatos_app;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

/**
 *
 * @author Alcides Blandon
 */
public class GatosSevice {

    public static void verGatitos() {
        //1. Vamos a traer los datos de la API
        OkHttpClient client = new OkHttpClient();
        
        Request request = new Request.Builder()
                .url("https://api.thecatapi.com/v1/images/search")
                .method("GET", null)
                .build();
        
    }
}
