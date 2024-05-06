package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import data.Fichero1Reader;
import data.Fichero2Reader;
import data.FileLister;
import data.Producto;
import utilidades.WriteFile;
import utilidades.ComprobarProductos;

public class Start {

    public static void main(String[] args) {
        
        List<String> nombres = FileLister.getFileNamesStartingWithFT();
        System.out.println("voy a sacar los nombres de los ficheros");
        
        for(String s: nombres) {
            System.out.println(s);
        }
        
        System.out.println("PRIMERA LISTA");
        
        
        Fichero1Reader lector = new Fichero1Reader(); 
        ArrayList<Producto> productosFichero1 = lector.getDatos("./FT_archivo1.txt");
        System.out.println(productosFichero1);
        System.out.println("************************************************************************");
        
        
        System.out.println("SEGUNDA LISTA");
        System.out.println("************************************************************************");
        
       
        
        Fichero2Reader lector2 = new Fichero2Reader(); 
        ArrayList<Producto> productosFichero2 = lector2.getDatos("./FT_archivo2.txt");
        System.out.println(productosFichero2);
        System.out.println("************************************************************************");

      

        // Combina las dos listas en una sola
        ArrayList<Producto> todosLosProductos = new ArrayList<>();
        todosLosProductos.addAll(productosFichero1);
        todosLosProductos.addAll(productosFichero2);
        
        System.out.println("LISTA FINAL");
        System.out.println("***********************************************************************************************");

        ComprobarProductos comprobador = new ComprobarProductos();
        Map<String, Producto> productosCombinados = comprobador.combinarProductos(todosLosProductos);

        // Crear un ArrayList a partir de los valores del Map
        ArrayList<Producto> listaProductosCombinados = new ArrayList<>(productosCombinados.values());

        System.out.println(listaProductosCombinados);
        
        WriteFile fw = new WriteFile("./final.txt");
		fw.write(listaProductosCombinados);
    }
}
