/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author SALA H
 */
public class MayorEdad  extends Persona{

    private String tarjeta;

    public MayorEdad(String n, String tar) {
        super(n);
        tarjeta = tar;
    }

    public void establecerTarjeta(String n) {
        tarjeta = n;
    }

    public String obtenerTarjeta() {
        return tarjeta;
    }

}
