package com.company;

import model.Android;
import model.Character;
import model.CollectionPj;
import model.Demon;
import model.Human;
import model.Namekian;
import model.Saiyan;

public class Main {

    public static void main(String[] args) {
    	Namekian dende = new Namekian("Dende", 5, true, "Namek", "comun", false);
    	System.out.println(dende.hit_basic());
    	System.out.println(dende.hit_ki());
    	System.out.println(dende.toString());
    	
    	Android numero17 = new Android("Numero17",10000 , true, "Tierra", "Dr Gero");
    	System.out.println(numero17.toString());
    	
    	Human krillin = new Human("Krillin",75000 , true, "Tierra", true);
    	System.out.println(krillin.toString());
    	
    	Demon frezerDemon = new Demon("Freezer", 500000, false, "Galaxia", 5, false);
    	System.out.println(frezerDemon.toString());
    	
    	CollectionPj<Character> colectora1 = new CollectionPj<Character>();
    	colectora1.addElement(krillin);
    	colectora1.addElement(frezerDemon);
    	colectora1.addElement(numero17);
    	System.out.println(colectora1.amountElement());
    	System.out.println(colectora1.searchElement(numero17));
    	System.out.println(colectora1.searchElement(krillin));
    	colectora1.remove(frezerDemon);
    	colectora1.show(); 
    }
}
 