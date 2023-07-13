/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class MenorEdad extends Persona {

    private MayorEdad padre;

    
    public MenorEdad(String n, MayorEdad p) {
        super(n);
        padre = p;
    }

    public void establecerRepresentante(MayorEdad m) {
        padre = m;
    }

    public MayorEdad obtenerRepresentante() {
        return padre;
    }

}
