package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

import files.SaveRead;
import model.Character;
import model.CollectionPj;
import model.Custom;
import model.Login;
import model.Menu;
import model.Namekian;
import model.Register;
import model.User;
import model.UserDataBase;

public class Main {

	static Scanner scanner;
    public static void main(String[] args) {
    	
//    	//Namekianos agregados
    	Namekian patriarca = new Namekian("Patriarca", 6, false, "Namek", "comun", false);
//    	
//    	Namekian piccolo = new Namekian("Piccolo", 7000, true, "Tierra", "combatiente", true);
//    	
//    	Namekian nail = new Namekian("Nail", 1500, false, "Namek", "combatiente", true);
//    	
//    	Namekian kingPiccolo = new Namekian("King Piccolo", 800, false, "Namek", "combatiente", false);
//    	
//    	//Androides agregados
//    	
//    	Android numero17 = new Android("Numero17",10000 , true, "Tierra", "Dr Gero");
//    	
//    	Android numero18 = new Android("Numero18",9000 , true, "Tierra", "Dr Gero");
//    	
//    	Android numero16 = new Android("Numero16",9500 , false, "Tierra", "Dr Gero");
//    	
//    	Android numero20 = new Android("Numero20",5000 , false, "Tierra", "Dr Gero");
//    	
//    	//Humanos agregados
//    	
//    	Human krillin = new Human("Krillin",75000 , true, "Tierra", true);
//    	
//    	Human yamcha = new Human("Yamcha",1000, true, "Tierra", true);
//    	
//    	Human tenShinHan = new Human("Ten Shin Han",85000, true, "Tierra", true);
//    	
//    	Human chaoz = new Human("Chaoz",1500, false, "Tierra", true);
//    	
//    	//Demonios agregados
//    	
//    	Demon frezerDemon = new Demon("Freezer", 500000, false, "Galaxia", 5, false);
//    	
//    	Demon kingCold = new Demon("King Cold",40000, false, "Galaxia", 1, false);
//    	
//    	Demon cooler = new Demon("Cooler",70000,false,"Galaxia",2,false);
//    	
//    	Demon majinBoo = new Demon("Majin Boo",600000, true, "Galaxia", 1, true);
//    	
//    	//Saiayins agregados
//    	
//    	Saiyan vegetta = new Saiyan("Vegetta",1000000000 , true , "Tierra", 2, true, true );
//    	
//    	Character goku = new Saiyan("Goku",2000000000 , true , "Tierra", 3, true, true );
//    	
//    	Saiyan gohan = new Saiyan("Gohan",900000000 , true , "Tierra", 2, false, true );
//    	
//    	Saiyan trunks = new Saiyan("Trunks",800000000 ,true, "Tierra", 1, false, true);
//    	
//    	//Personajes agregados a la colectora
//    	
//    	CollectionPj<Character> colectora1 = new CollectionPj<Character>();
////    	colectora1.addElement(dende);
////    	colectora1.addElement(piccolo);
////    	colectora1.addElement(nail);
////    	colectora1.addElement(kingPiccolo);
////    	colectora1.addElement(numero17);
////    	colectora1.addElement(numero18);
////    	colectora1.addElement(numero16);
////    	colectora1.addElement(numero20);
////    	colectora1.addElement(krillin);
////    	colectora1.addElement(yamcha);
////    	colectora1.addElement(tenShinHan);
////    	colectora1.addElement(chaoz);
////    	colectora1.addElement(frezerDemon);
////    	colectora1.addElement(kingCold);
////    	colectora1.addElement(cooler);
////    	colectora1.addElement(majinBoo);
////    	colectora1.addElement(vegetta);
////    	colectora1.addElement(goku);
////    	colectora1.addElement(gohan);
////    	colectora1.addElement(trunks);
//    	System.out.println("Cantidad de personajes");
//    	System.out.println(colectora1.amountElement());
//    	System.out.println("\n");
//    	System.out.println(colectora1.searchElement(numero17));
//    	System.out.println(colectora1.searchElement(krillin));
//    	colectora1.remove(frezerDemon);
////    	colectora1.show(); 
//    	
//    	///Manejo de archivos
////    	File file = new File("archivoPrueba.txt"); //se inicializa el objeto archivo
////    	if(!file.exists()) {
////    		try {
////    			file.createNewFile();
////    			System.out.println(file.getName()+" ha sido creado");
////			} catch (IOException ex) {
////				ex.printStackTrace();
////			}
////    		
////    	}
    	
    	///Menu Final
    	
    	File mfile = new File("nuevoArchivo.txt"); /// Se crean los 3 archivos
    	File archivocustom = new File("archivocustom.txt");
    	File archivousuario = new File("archivousuario.txt");
//    	try {
//			archivocustom.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	try {
//			archivousuario.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	
    	
    	CollectionPj<Character> coleccionPj = new CollectionPj<Character>(); // se crean las colecciones donde van 
    	CollectionPj<Custom> coleccionCustom = new CollectionPj<Custom>();  //a estar guardados los datos para trabajar
    	UserDataBase userList = new UserDataBase();

    	SaveRead.readHash2(mfile, coleccionPj); /// se guarda lo q esta en el archivo en las colecciones	
    	SaveRead.readHash2(archivocustom, coleccionCustom);
    	SaveRead.readHashMap(archivousuario, userList);
    	
    	User u = new User(); ///ver motivo ?¡
    	System.out.println("coleccion pj");
    	SaveRead.readHash(mfile);
//    	System.out.println("---------------");
    	System.out.println("coleccion user");
//    	System.out.println("---------------");
    	SaveRead.readHashMap(archivousuario, userList);
    	
    	scanner = new Scanner(System.in);
    	int eleccionIngresar = 0;
    	int eleccionWhile = 0;
    	
    	
    	while (eleccionWhile == 0) 
    	{
    		
    		
    		System.out.println("Ingrese opcion:");
    		System.out.println("1.Registrarse");	
    		System.out.println("2.Ingresar");
    		eleccionIngresar = scanner.nextInt();
    	
    	
    		if (eleccionIngresar==1)
    		{
    			u = Register.register_menu(userList);
    			userList.addUser(u);
    		}
    		else if (eleccionIngresar==2)
    		{
    			Login.login_menu(coleccionPj, coleccionCustom, userList, u, mfile, archivocustom, archivousuario);
    		}
    		else
    		{
    			System.out.println("Opcion incorrecta.");
    		}
    	
    		System.out.println("Desea continuar? [Si=0] [No=1]");
    		eleccionWhile = scanner.nextInt();
    }
    	
    	
    	
    }
 
    
}
 