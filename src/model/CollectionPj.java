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

	public String  show() {
		Iterator<T> itrIterator = collectionHashSet.iterator();
		String msg = "";
		while (itrIterator.hasNext()) {
			T element = itrIterator.next();
			msg = msg.concat("\n"+ element.toString());
		}
		return msg;
	}
	
	public T searchElement(String name) {
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
	
	public String showForPlanet(String planet) {
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

	public boolean remove(T element) {
		return collectionHashSet.remove(element);

	}
	public HashSet<T> getCollectionHashSet() {
		return collectionHashSet;
	}

}
