package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Fichero2Reader {

	public ArrayList<Producto> getDatos(String fichero){
	    BufferedReader ficheroEntrada;
	    ArrayList<Producto> productos = new ArrayList<Producto>();
	    try {
	        ficheroEntrada = new BufferedReader(new FileReader(fichero));
	        String codigo = ficheroEntrada.readLine();
	        
	        while(codigo !=null) {
	            int cantidad = Integer.parseInt(ficheroEntrada.readLine());
	            float precio = Float.parseFloat(ficheroEntrada.readLine()); // Cambiado a int
	            String separacion = ficheroEntrada.readLine();
	            
	            Producto producto = new Producto(codigo,cantidad,precio,separacion);
	            productos.add(producto); // Añade el producto a la lista

	            codigo = ficheroEntrada.readLine(); // Lee el próximo código
	        }
	        ficheroEntrada.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }  catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
	    return productos; 
	}
}
