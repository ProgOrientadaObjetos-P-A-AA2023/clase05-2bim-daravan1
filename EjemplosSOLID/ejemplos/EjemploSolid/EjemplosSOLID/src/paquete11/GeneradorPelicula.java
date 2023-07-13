/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete11;

import java.util.ArrayList;

public class GeneradorPelicula {
    
    private APIMovie llave;
    private String url;
    private String user;
    private ArrayList<GeneradorPelicula> lista;
    
    public void establecerLlave(APIMovie l){ // APINetflix, APIAmazon
        llave = l;
    }
     public void establecerLista(ArrayList<GeneradorPelicula> lis) {
        lista = lis;
    }
    public void establecerUrl(String l){
        url = String.format("%s%s", l, obtenerLlave().obtenerApiKey());
    }
    public void establecerUser(String l){
        user =l;
    }
    public String obtenerUser(){
        return user;
    }
    public APIMovie obtenerLlave(){
        return llave;
    }
    public ArrayList<GeneradorPelicula> obtenerLista() {
        return lista;
    }
    public String obtenerUrl(){
        return url;
    }
    
}
