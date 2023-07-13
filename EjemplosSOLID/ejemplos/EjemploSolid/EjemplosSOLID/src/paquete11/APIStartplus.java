/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

/**
 *
 * @author SALA H
 */
public class APIStartplus implements APIMovie {

    private String apiKey;

    @Override
    public void establecerApiKey() {
        apiKey = String.format("%d", ((int) (Math.random() * 100000) + 1));
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }
}
