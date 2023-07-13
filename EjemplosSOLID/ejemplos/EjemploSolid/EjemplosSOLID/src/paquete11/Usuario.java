/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

/**
 *
 * @author darav
 */
public class Usuario {

    String nombre;
    String tipo;

    public Usuario(String n, String t) {
        nombre = n;
        tipo = t;
    }

    public void establecerTipo(String t) {
        tipo = t;
    }
    public void establecerNombre(String n) {
        nombre = n;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerTipo() {
        return tipo;
    }
}
