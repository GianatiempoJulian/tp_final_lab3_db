package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;


import org.json.JSONObject;
import files.SaveRead;
import model.Character;
import model.CollectionPj;
import model.Custom;
import model.JsonObject;
import model.JsonUtiles;
import model.Login;
import model.Menu;
import model.Namekian;
import model.Register;
import model.Saiyan;
import model.User;
import model.UserDataBase;

public class Main {

	static Scanner scanner;
    public static void main(String[] args) {
    	

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
    	
    	///***============================JSON============================***///
    	 System.out.println("JSON:");
    	 File jsonFile = new File ("archivojson.json");
         String jsonString = "archivojson.json";

         //JsonUtiles.grabar(JsonObject.devolverJSON(),jsonString); // esto se tiene q ejecutar solo una vez

     
        JSONObject jsonObject = new JSONObject(JsonUtiles.leer(jsonString));
        JsonObject.JSONtoJava(JsonUtiles.leer(jsonString));
  
        System.out.println("-------------------------------------------------------------------:");
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
    	
    	///***============================CONTENEDORAS============================***///
    	
    	CollectionPj<Character> coleccionPj = new CollectionPj<Character>(); // se crean las colecciones donde van 
    	CollectionPj<Custom> coleccionCustom = new CollectionPj<Custom>();  //a estar guardados los datos para trabajar
    	UserDataBase userList = new UserDataBase(); //creamos nuestra base de usuarios
    	
    	SaveRead.writeHashMap(userList.getUserList(), archivousuario);
    	
    	SaveRead.readHash2(mfile, coleccionPj); /// se guarda lo q esta en el archivo en las colecciones	
    	SaveRead.readHash2(archivocustom, coleccionCustom);
    	SaveRead.readHashMap(archivousuario, userList);
    	
    	User u = new User(); ///ver motivo ?¡
 
    	//SaveRead.readHash(mfile);

 
    	///***============================VARIABLES MANEJO MENU============================***///
    	scanner = new Scanner(System.in);
    	int eleccionIngresar = 0;
    	int eleccionWhile = 0;
    	
    	
    	///***============================MENU============================***///
    	
    	while (eleccionWhile == 0) 
    	{
    		
    		System.out.println("\nBienvenido a DragonJava! Que desea hacer?\n");
    		System.out.println("Ingrese opcion:");
    		System.out.println("\n1.Registrarse");	
    		System.out.println("\n2.Ingresar");
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
    	
    	System.out.println("Fin del programa");
    	
    }
 
    
}
 