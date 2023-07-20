/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete11;

public class GeneradorPelicula {

    private APIMovie llave;
    private String url;
    private String user;
    private String tipo;

    public void establecerLlave(APIMovie l) { // APINetflix, APIAmazon
        llave = l;
    }

    public void establecerUser(String l) {
        user = l;
    }

    public void establecerTipo(String t) {
        tipo = t;
    }

    public void establecerUrl() {
        url = String.format("http://api.movie?api=%s%s", obtenerTipo(), obtenerLlave().obtenerApiKey());
    }

    public String obtenerUser() {
        return user;
    }

    public APIMovie obtenerLlave() {
        return llave;
    }

    public String obtenerUrl() {
        return url;
    }

    public String obtenerTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        String cadena = "Lista Urls\n";

        cadena = String.format("%s: %s",  obtenerUser(), obtenerUrl());

        return cadena;
    }

}
