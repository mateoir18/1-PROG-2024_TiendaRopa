package utilidades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.Producto;

public class ComprobarProductos {

	 public Map<String, Producto> combinarProductos(List<Producto> productos) {
	        Map<String, Producto> mapaProductos = new HashMap<>();

	        for (Producto producto : productos) {
	            String codigo = producto.getCodigo();
	            if (mapaProductos.containsKey(codigo)) {
	                // El producto ya existe, actualizar cantidad y precio si es necesario
	                Producto existente = mapaProductos.get(codigo);
	                existente.setCantidad(existente.getCantidad() + producto.getCantidad());
	                if (producto.getPrecio() > existente.getPrecio()) {
	                    existente.setPrecio(producto.getPrecio());
	                }
	            } else {
	                // El producto no existe, añadir al mapa
	                mapaProductos.put(codigo, producto);
	            }
	        }

	        return mapaProductos;
	    }
}
