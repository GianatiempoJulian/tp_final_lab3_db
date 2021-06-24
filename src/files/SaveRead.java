package files;

import java.io.EOFException; 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import model.CollectionPj;
import model.User;
import model.UserDataBase;

public class SaveRead {

	public static <T> void writeHash(HashSet<T> collection, File mf) {
		ObjectOutputStream salida = null;
		try {
			salida = new ObjectOutputStream(new FileOutputStream(mf));

			Iterator<T> itrIterator = collection.iterator();
			while (itrIterator.hasNext()) {
				T element = itrIterator.next();
				salida.writeObject(element);
			}

		} catch (IOException e) {
			System.out.println("error en el archivo de escritura");

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
			System.out.println("Error en el archivo de lectura");
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

	public static <T> void readHash2(File mf,CollectionPj<T> coleccion ) {
		ObjectInputStream entrada2 = null;
		try {
			boolean more = true;
			entrada2 = new ObjectInputStream(new FileInputStream(mf));

			while (more) {
				T element = (T) entrada2.readObject();
				
				coleccion.addElement(element);
			}

		} catch (EOFException e) {
			
		}

		catch (IOException ef) {
			System.out.println("Error en el archivo de agregar elemento");
			ef.printStackTrace();
		} catch (ClassNotFoundException er) {
			System.out.println("No se encontro la clase");
			er.printStackTrace();
		} finally {
			try {

				entrada2.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public static void readHashMap(File fuser,UserDataBase coleccion) {
		
		
		ObjectInputStream entrada3 = null;
		
		try {
			
			boolean more = true;
			
			entrada3 = new ObjectInputStream(new FileInputStream(fuser));
			
			while (more) {
				
				User element = (User) entrada3.readObject();
							
				coleccion.addUser(element);
				
			}

		} catch (EOFException e) {
			
			System.out.println("Fin de lectura de nuestros Usuarios");
		}

		catch (IOException ef) {
			System.out.println("Error en el archivo de lectura del usuario");
		} catch (ClassNotFoundException er) {
			System.out.println("No se encontro la clase");
		} finally {
			try {
				entrada3.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
	public static void writeHashMap(HashMap<Integer,User> collection, File mf) {
		
		ObjectOutputStream salida2 = null;
		

		try {
			
			
			salida2 = new ObjectOutputStream(new FileOutputStream(mf));
		
			Iterator itrIterator = collection.entrySet().iterator();
			
			while (itrIterator.hasNext()) {
			
				Map.Entry me = (Map.Entry) itrIterator.next();
				salida2.writeObject((User)me.getValue());
			
			}
			
			
		} catch (IOException e) {
			System.out.println("error en el archivo de escritura del mapa");

		} finally {
			
			try {
				
				salida2.close();
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
