package model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionPj<T> {

	private HashSet<T> collectionHashSet;

	ObjectOutputStream salida = null;
	ObjectInputStream entrada = null;

	public CollectionPj() {
		collectionHashSet = new HashSet<T>();
	}

	public void addElement(T element) {
		collectionHashSet.add(element);
	}

	public int amountElement() {
		return collectionHashSet.size();
	}

	public boolean searchElement(T element) {
		return collectionHashSet.contains(element);
	}

	public void show() {
		Iterator<T> itrIterator = collectionHashSet.iterator();
		while (itrIterator.hasNext()) {
			T element = itrIterator.next();
			System.out.println(element);
			System.out.println("\n");
		}

	}

	public void writeHash() {

		try {
			salida = new ObjectOutputStream(new FileOutputStream("nuevoArchivo.txt"));

			Iterator<T> itrIterator = collectionHashSet.iterator();
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

	public void readHash() { /// esta sirve para escribir cuando hay una coleccion con datos ejecutandose al
								/// momento
		try {

			entrada = new ObjectInputStream(new FileInputStream("nuevoArchivo.txt"));

			Iterator<T> itrIterator = collectionHashSet.iterator();
			while (itrIterator.hasNext()) {
				T element = itrIterator.next();
				element = (T) entrada.readObject();
				System.out.println(element);

			}

		} catch (IOException e) {
			System.out.println("error en el archivo");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			System.out.println("no encontro la clase");
		} finally {
			try {
				System.out.println("termine");
				entrada.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	public boolean remove(T element) {
		return collectionHashSet.remove(element);

	}

	public void readHash2() { /// esta sirve para cuando los datos ya fueron guardados
		try {
			boolean more = true;
			entrada = new ObjectInputStream(new FileInputStream("nuevoArchivo.txt"));

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
