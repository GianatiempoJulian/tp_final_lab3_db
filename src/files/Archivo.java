package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Character;
import model.CollectionPj;
import model.Saiyan;

public class Archivo {
		public static void escribir(Character ejem) {
			ObjectOutputStream bn = null;
			
			try {
				bn = new ObjectOutputStream(new FileOutputStream("nuevoArchivo.txt"));
				bn.writeObject(ejem);
				
				
			} catch (IOException e) {
				System.out.println("error en el archivo");
				
			} finally {
				try {
					bn.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	
}
