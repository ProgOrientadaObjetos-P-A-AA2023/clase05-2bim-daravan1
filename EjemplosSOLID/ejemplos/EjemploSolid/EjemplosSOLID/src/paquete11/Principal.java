/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete11;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        /*
        Usar el txt llamado usuarios.txt; por cada línea del archivo
        crer un API en función de su servicio; además el API ahora genera
        información estática (no cambia el API), se debe buscar la forma que el 
        API sea dinámico totalmente (usar alguna librería propia de JAVA, tipo 
        Random); la url final debe contener el tipo de servicio y el user
        Por cada objeto de tipo GeneradoPelicula presentar la información 
        a través de un toString
         */
        String nombreArc = "usuarios.txt";
        LecturaUsuarios lectura = new LecturaUsuarios(nombreArc);
        lectura.establecerLista();

        ArrayList<GeneradorPelicula> lista = new ArrayList<>();

        for (int i = 0; i < lectura.obtenerLista().size(); i++) {

            GeneradorPelicula p = new GeneradorPelicula();

            if (lectura.obtenerLista().get(i).obtenerTipo().equals("Netflix")) {
                APINetflix api = new APINetflix();
                String tipo = String.format("%s",
                        lectura.obtenerLista().get(i).obtenerTipo());
                String usuario = String.format("%s",
                        lectura.obtenerLista().get(i).obtenerUser());

                api.establecerApiKey();
                p.establecerTipo(tipo);
                p.establecerLlave(api);
                p.establecerUser(usuario);

                p.establecerUrl();
                lista.add(p);
            }

            if (lectura.obtenerLista().get(i).obtenerTipo().equals("Disney")) {
                APIDisney api = new APIDisney();
                String tipo = String.format("%s",
                        lectura.obtenerLista().get(i).obtenerTipo());
                String usuario = String.format("%s",
                        lectura.obtenerLista().get(i).obtenerUser());

                api.establecerApiKey();
                p.establecerTipo(tipo);
                p.establecerLlave(api);
                p.establecerUser(usuario);

                p.establecerUrl();
                lista.add(p);

            }

            if (lectura.obtenerLista().get(i).obtenerTipo().equals("Amazon")) {
                APIAmazonMovie api = new APIAmazonMovie();
                String tipo = String.format("%s",
                        lectura.obtenerLista().get(i).obtenerTipo());
                String usuario = String.format("%s",
                        lectura.obtenerLista().get(i).obtenerUser());

                api.establecerApiKey();
                p.establecerTipo(tipo);
                p.establecerLlave(api);
                p.establecerUser(usuario);

                p.establecerUrl();
                lista.add(p);

            }

            if (lectura.obtenerLista().get(i).obtenerTipo().equals("Startplus")) {

                APIStartplus api = new APIStartplus();

                String tipo = String.format("%s",
                        lectura.obtenerLista().get(i).obtenerTipo());
                String usuario = String.format("%s",
                        lectura.obtenerLista().get(i).obtenerUser());

                api.establecerApiKey();
                p.establecerTipo(tipo);
                p.establecerLlave(api);
                p.establecerUser(usuario);
                p.establecerUrl();
                lista.add(p);

            }

        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
    }

}
