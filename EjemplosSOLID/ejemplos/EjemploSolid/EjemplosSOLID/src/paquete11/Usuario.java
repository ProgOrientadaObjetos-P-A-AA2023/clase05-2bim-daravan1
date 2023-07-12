/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

/**
 *
 * @author SALA H
 */
public class Usuario {
    
    String nombre;
    String tipo;

    public Usuario(String n, String t) {
        nombre = n;
        tipo = t;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String  obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
