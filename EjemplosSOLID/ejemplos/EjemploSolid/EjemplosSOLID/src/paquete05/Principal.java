/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov)
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        Agregar una tarjeta de crédito a
        un menor de edad
        
        ¿Qué se puede plantear?
        */
        try {
            MayorEdad mayor = new MayorEdad("Carlos", "11101102145");
            MenorEdad menor = new MenorEdad("Felipe", mayor);
            System.out.printf("Nombre:%s - Tarjeta:%s\n",
                    menor.obtenerNombre(), menor.obtenerRepresentante().obtenerTarjeta());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
