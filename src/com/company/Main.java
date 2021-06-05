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
    	
    	//Namekianos agregados
    	Namekian dende = new Namekian("Dende", 5, true, "Namek", "comun", false);
    	
    	Namekian piccolo = new Namekian("Piccolo", 7000, true, "Tierra", "combatiente", true);
    	
    	Namekian nail = new Namekian("Nail", 1500, false, "Namek", "combatiente", true);
    	
    	Namekian kingPiccolo = new Namekian("King Piccolo", 800, false, "Namek", "combatiente", false);
    	
    	//Androides agregados
    	
    	Android numero17 = new Android("Numero17",10000 , true, "Tierra", "Dr Gero");
    	
    	Android numero18 = new Android("Numero18",9000 , true, "Tierra", "Dr Gero");
    	
    	Android numero16 = new Android("Numero16",9500 , false, "Tierra", "Dr Gero");
    	
    	Android numero20 = new Android("Numero20",5000 , false, "Tierra", "Dr Gero");
    	
    	//Humanos agregados
    	
    	Human krillin = new Human("Krillin",75000 , true, "Tierra", true);
    	
    	Human yamcha = new Human("Yamcha",1000, true, "Tierra", true);
    	
    	Human tenShinHan = new Human("Ten Shin Han",85000, true, "Tierra", true);
    	
    	Human chaoz = new Human("Chaoz",1500, false, "Tierra", true);
    	
    	//Demonios agregados
    	
    	Demon frezerDemon = new Demon("Freezer", 500000, false, "Galaxia", 5, false);
    	
    	Demon kingCold = new Demon("King Cold",40000, false, "Galaxia", 1, false);
    	
    	Demon cooler = new Demon("Cooler",70000,false,"Galaxia",2,false);
    	
    	Demon majinBoo = new Demon("Majin Boo",600000, true, "Galaxia", 1, true);
    	
    	//Saiayins agregados
    	
    	Saiyan vegetta = new Saiyan("Vegetta",1000000000 , true , "Tierra", 2, true, true );
    	
    	Saiyan goku = new Saiyan("Goku",2000000000 , true , "Tierra", 3, true, true );
    	
    	Saiyan gohan = new Saiyan("Gohan",900000000 , true , "Tierra", 2, false, true );
    	
    	Saiyan trunks = new Saiyan("Trunks",800000000 ,true, "Tierra", 1, false, true);
    	
    	//Personajes agregados a la colectora
    	
    	CollectionPj<Character> colectora1 = new CollectionPj<Character>();
    	colectora1.addElement(dende);
    	colectora1.addElement(piccolo);
    	colectora1.addElement(nail);
    	colectora1.addElement(kingPiccolo);
    	colectora1.addElement(numero17);
    	colectora1.addElement(numero18);
    	colectora1.addElement(numero16);
    	colectora1.addElement(numero20);
    	colectora1.addElement(krillin);
    	colectora1.addElement(yamcha);
    	colectora1.addElement(tenShinHan);
    	colectora1.addElement(chaoz);
    	colectora1.addElement(frezerDemon);
    	colectora1.addElement(kingCold);
    	colectora1.addElement(cooler);
    	colectora1.addElement(majinBoo);
    	colectora1.addElement(vegetta);
    	colectora1.addElement(goku);
    	colectora1.addElement(gohan);
    	colectora1.addElement(trunks);
    	System.out.println("Cantidad de personajes");
    	System.out.println(colectora1.amountElement());
    	System.out.println("\n");
    	System.out.println(colectora1.searchElement(numero17));
    	System.out.println(colectora1.searchElement(krillin));
    	colectora1.remove(frezerDemon);
    	colectora1.show(); 
    }
}
 