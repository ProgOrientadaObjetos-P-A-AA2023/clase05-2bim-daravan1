/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author darav
 */
public final class LecturaArchivo {

    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<GeneradorPelicula> lista;

    public LecturaArchivo(String n) {
        nombreArchivo = n;

        rutaArchivo = String.format("datos/%s", obtenerNombreArchivo());
        File f = new File(rutaArchivo);
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
            } // fin de try
            catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("datos/%s.txt",
                obtenerNombreArchivo());;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")));

                GeneradorPelicula p = new GeneradorPelicula();

                if (linea_partes.get(2).equals("Netflix")) {
                    APINetflix api = new APINetflix();
                    String tipo = linea_partes.get(2);

                    api.establecerApiKey();
                    p.establecerTipo(tipo);
                    p.establecerLlave(api);
                  
                    p.establecerUrl();
                    lista.add(p);
                }

                if (linea_partes.get(2).equals("Disney")) {
                    APIDisney api = new APIDisney();
                    String apiKey = String.format("%s",
                            linea_partes.get(2));
                    api.establecerApiKey();
                    String tipo = linea_partes.get(2);

                    p.establecerLlave(api);
                    p.establecerTipo(tipo);

                    p.establecerUrl();
                    lista.add(p);
                }

                if (linea_partes.get(2).equals("Amazon")) {
                    APIAmazonMovie api = new APIAmazonMovie();
                    String apiKey = String.format("%s",
                            linea_partes.get(2));
                    api.establecerApiKey();

                    p.establecerLlave(api);
                    String tipo = linea_partes.get(2);

                    p.establecerTipo(tipo);

                    p.establecerUrl();
                    lista.add(p);
                }

                if (linea_partes.get(2).equals("Startplus")) {
                    APIStartplus api = new APIStartplus();
                    String apiKey = String.format("%s",
                            linea_partes.get(2));
                    api.establecerApiKey();
                    String tipo = linea_partes.get(2);

                    p.establecerLlave(api);
                    p.establecerTipo(tipo);

                    p.establecerUrl();
                    lista.add(p);
                }

            }
        }
    }

    public ArrayList<GeneradorPelicula> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

  
}
