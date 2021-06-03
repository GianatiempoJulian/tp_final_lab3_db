package com.company;

import model.Androide;
import model.Character;
import model.Humano;
import model.Namekiano;
import model.Saiyan;

public class Main {

    public static void main(String[] args) {
    	Namekiano dende = new Namekiano("Dende", 5, true, "Namek", "comun", false);
    	System.out.println(dende.hit_basic());
    	System.out.println(dende.hit_ki());
    	System.out.println(dende.toString());
    	
    	Androide numero17 = new Androide("Numero17",10000 , true, "Tierra", "Dr Gero");
    	System.out.println(numero17.toString());
    	
    	Humano krillin = new Humano("Krillin",75000 , true, "Tierra", true);
    	System.out.println(krillin.toString());
    }
}
 