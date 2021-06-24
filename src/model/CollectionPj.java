package model;


import java.util.HashSet;
import java.util.Iterator;

public class CollectionPj<T> {

	private HashSet<T> collectionHashSet;

	///***============================CONSTRUCTORES============================***///
	
	public CollectionPj() {
		collectionHashSet = new HashSet<T>();
	}

	///***============================FUNCIONES============================***///
	
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

	/**
	 * Muestra a todos los personajes de la coleccion
	 * @return <b>un String con todos los personajes.</b>
	 */
	
	public String  show() 
	{
		Iterator<T> itrIterator = collectionHashSet.iterator();
		String msg = "";
		while (itrIterator.hasNext()) {
			T element = itrIterator.next();
			msg = msg.concat("\n"+ element.toString());
		}
		return msg;
	}
	
	/**
	 * 
	 * @param name - String con el nombre buscado.
	 * @return <b>un objecto generico "T" con el elemento encontrado en dicha coleccion.</b>
	 */
	public T searchElement(String name) 
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

	/**
	 * 
	 * @param planet - String con el nombre del planeta.
	 * @return <b>un String con todos los personajes del planeta.</b>
	 */
	
	public String showForPlanet(String planet) 
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

	/**
	 * 
	 * @param u - Personaje que deseamos comparar con el resto.
	 * @return <b>un String con todos los personajes que son mas debiles que el enviado por parametro.</b>
	 */
	
	public String strongerThan (T u) 
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
