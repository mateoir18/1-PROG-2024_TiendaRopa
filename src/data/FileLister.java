package data;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class FileLister {

	private static String CADENA_INICIO_FICHERO = "FT_";

	public static List<String> getFileNamesStartingWithFT() {

		// Crear una instancia de File para el directorio especificado
		File directory = new File("./");
		// Crear un filtro para los archivos que comienzan con "FT_"
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.startsWith(CADENA_INICIO_FICHERO);
			}
		};
		// Obtener la lista de archivos que cumplen con el filtro
		String[] files = directory.list(filter);
		// Crear una lista para almacenar los nombres de los archivos
		List<String> fileList = new ArrayList<String>();
		// Comprobar si se encontraron archivos y agregarlos a la lista
		if (files != null) {
			for (String file : files) {
				fileList.add(file);
			}
		}
		return fileList;
	}
}
