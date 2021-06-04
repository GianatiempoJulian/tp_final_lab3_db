package com.company;

import model.Android;
import model.Human;
import model.Namekian;

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
    }
}
 