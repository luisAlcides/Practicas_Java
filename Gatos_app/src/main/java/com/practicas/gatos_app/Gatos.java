package com.practicas.gatos_app;

/**
 *
 * @author Alcides Blandon
 */
public class Gatos {

    String id;
    String url;
    String apikey = "50f4b7a9-2ab2-4c09-9889-f4c4e58a9ea9";
    String image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
