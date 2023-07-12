/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

/**
 *
 * @author SALA H
 */
public class APIDisney implements APIMovie{
      private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"DISNEY4578781";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
}
