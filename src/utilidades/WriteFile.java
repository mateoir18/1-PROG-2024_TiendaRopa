package utilidades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import data.Producto;

public class WriteFile {

	private String donde;

	public WriteFile(String donde) {
		this.donde = donde;
	}

	public void write(List<Producto> datos) {

		try {

			File file = new File(donde);

			// A stream that connects to the text file
			FileWriter fileReader = new FileWriter(file);

			// Connect the FileWriter to the BufferedWriter
			BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
			for (Producto p : datos) {

				// writed data and inserts new line
				bufferedWriter.write(p + "\n");
			}
			bufferedWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
