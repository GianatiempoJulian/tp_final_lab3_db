package model;


import java.util.HashSet;
import java.util.Iterator;

public class CollectionPj<T> {

	private HashSet<T> collectionHashSet;

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

	public boolean remove(T element)
	{
		return collectionHashSet.remove(element);

	}

	public String  show() ///Muestra a todos los personajes de la coleccion
	{
		Iterator<T> itrIterator = collectionHashSet.iterator();
		String msg = "";
		while (itrIterator.hasNext()) {
			T element = itrIterator.next();
			msg = msg.concat("\n"+ element.toString());
		}
		return msg;
	}
	
	public T searchElement(String name) ///Busca por nombre.
	{
		Iterator <T> itrIterator = collectionHashSet.iterator();
		T elementAux = null;
		while(itrIterator.hasNext())
		{
			T element1 = itrIterator.next();
			if(((Character) element1).getChar_name().equals(name))
			{
				elementAux = element1;
			}
		}
		
		return elementAux;
	}
	//Se puede implementar una excepcion en este metodo
	
	public String showForPlanet(String planet) ///Muestra a todos los miembros del planeta enviado
	{
		Iterator <T> itrIterator = collectionHashSet.iterator();
		Character element1 = null;
		String msg = "";
		while(itrIterator.hasNext()) {
			T element = itrIterator.next();
			element1 = (Character)element;
			if(element1.getChar_planet().equals(planet))
			{
				msg = msg.concat("\n"+ element.toString());
			}
			
		}
		return msg;
	}

	public HashSet<T> getCollectionHashSet() {
		return collectionHashSet;
	}

	public String strongerThan (T u) ///Funcion que devuelve un string con los personajes que son superados en poder por el enviado.
	{
		String msg = "";
		int i = 0;
		Iterator <T> itrIterator = collectionHashSet.iterator();

		while(itrIterator.hasNext()){
			T element1 = itrIterator.next();
			if(((Character) u).getChar_ki() > ((Character) element1).getChar_ki())
			{
				msg = msg.concat("\n"+element1.toString());
			}
		}
		return msg;
	}
}
