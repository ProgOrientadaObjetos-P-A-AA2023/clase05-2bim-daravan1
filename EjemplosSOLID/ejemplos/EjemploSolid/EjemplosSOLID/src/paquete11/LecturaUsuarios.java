/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author SALA H
 */
public class LecturaUsuarios {

    String usuario;
    String tipo;
    String nombreArchivo;

    public class ArchivoLectura {

        private Scanner entrada;
        private String nombreArchivo;
        private String rutaArchivo;
        private ArrayList<Usuario> lista;

        public ArchivoLectura(String n) {
            nombreArchivo = n;
            rutaArchivo = String.format("data/%s",
                    obtenerNombreArchivo());

            File f = new File(rutaArchivo);
            if (f.exists()) {
                try {
                    entrada = new Scanner(new File(rutaArchivo));
                } catch (FileNotFoundException e) {
                    System.err.println("Error al leer del archivo: " + e);
                }
            }
        }

        public void establecerNombreArchivo(String n) {
            nombreArchivo = n;
        }

        public void establecerRutaArchivo() {
            rutaArchivo = String.format("data/%s.txt",
                    obtenerNombreArchivo());
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
                            Arrays.asList(linea.split(";"))
                    );
                    Usuario p = new Usuario(linea_partes.get(0),
                            linea_partes.get(1));
                    lista.add(p);

                } // fin de while
            }
        }

        public ArrayList<Usuario> obtenerLista() {

            return lista;
        }

        public void cerrarArchivo() {
            if (entrada != null) {
                entrada.close();
            } // cierra el archivo

        }

        @Override
        public String toString() {
            String cadena = "Lista Usuarios\n";
            for (int i = 0; i < obtenerLista().size(); i++) {
                cadena = String.format("%s(%d) %s %s\n", cadena,
                        i + 1,
                        obtenerLista().get(i).obtenerNombre(),
                        obtenerLista().get(i).obtenerTipo());
            }
            return cadena;
        }

    }
}
