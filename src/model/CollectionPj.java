package model;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionPj<T> {
	
	private HashSet<T> collectionHashSet ;
	
	public CollectionPj() {
		collectionHashSet = new HashSet<T>();
	}
	
	public void addElement (T element) {
		collectionHashSet.add(element);
	}
	public int amountElement () {
		return collectionHashSet.size();
	}
	public boolean searchElement(T element) {
		return collectionHashSet.contains(element);
	}
	public void show() {
		Iterator <T> itrIterator = collectionHashSet.iterator();
		while(itrIterator.hasNext()) {
			T element = itrIterator.next();
			System.out.println(element);
			System.out.println("\n");
		}
		
	}
	public boolean remove(T element) {
		return collectionHashSet.remove(element);
		
	}
	
	
}
