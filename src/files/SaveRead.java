package files;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

public class SaveRead {
		
	
	public static <T> void writeHash(HashSet<T> collection,File mf) {
		ObjectOutputStream salida = null;
		try {
			salida = new ObjectOutputStream(new FileOutputStream(mf));

			Iterator<T> itrIterator = collection.iterator();
			while (itrIterator.hasNext()) {
				T element = itrIterator.next();
				salida.writeObject(element);
			}

		} catch (IOException e) {
			System.out.println("error en el archivo");

		} finally {
			try {
				salida.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
	public static <T> void readHash(File mf) { 
		ObjectInputStream entrada = null;
		try {
			boolean more = true;
			entrada = new ObjectInputStream(new FileInputStream(mf));

			while (more) {
				T element = (T) entrada.readObject();
				System.out.println(element);
			}

		} catch (EOFException e) {
			System.out.println("Fin de lectura");
		}

		catch (IOException ef) {
			System.out.println("Error en el archivo");
		} catch (ClassNotFoundException er) {
			System.out.println("No se encontro la clase");
		} finally {
			try {

				entrada.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	} 

}

























//public void readHash() { /// esta sirve para escribir cuando hay una coleccion con datos ejecutandose al
//	/// momento
//try {
//
//entrada = new ObjectInputStream(new FileInputStream("nuevoArchivo.txt"));
//
//Iterator<T> itrIterator = collectionHashSet.iterator();
//while (itrIterator.hasNext()) {
//T element = itrIterator.next();
//element = (T) entrada.readObject();
//System.out.println(element);
//
//}
//
//} catch (IOException e) {
//System.out.println("error en el archivo");
//
//} catch (ClassNotFoundException e) {
//
//e.printStackTrace();
//System.out.println("no encontro la clase");
//} finally {
//try {
//System.out.println("termine");
//entrada.close();
//} catch (IOException e2) {
//e2.printStackTrace();
//}
//}
//}

