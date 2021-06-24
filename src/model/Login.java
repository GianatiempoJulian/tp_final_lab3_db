package model;

import java.io.File;
import java.util.Scanner;

public class Login {

    static Scanner scanner;
    
  ///***============================FUNCIONES============================***///
    
    /**
     * El menu con todas las funciones para manejar el sistema una vez ingresado.
     * @param misPj - Coleccion de personajes de la serie.
     * @param misCustom - Coleccion de personajes custom.
     * @param db - Coleccion de usuarios.
     * @param u - Usuario que entra en el sistema.
     * @param fpj - Archivo  de personajes de la serie.
     * @param fcustom - Archivo de personajes custom.
     * @param fuser - Archivo de usuarios.
     */
    
    public static void login_menu(CollectionPj misPj,CollectionPj misCustom,UserDataBase db,User u,File fpj,File fcustom,File fuser) ///Menu de logeo de usuarios
    {

        scanner = new Scanner(System.in);
        int opcion = 0;
        int i = 0;
        String put_username = null;
        String put_password = null;
        User aux = null;


        System.out.println("\nLogin:");

        while (aux == null) {

            System.out.println("\nIngrese nombre de usuario: ");
            put_username = scanner.next();

            System.out.println("\nIngrese contraseña:");
            put_password = scanner.next();

            aux = db.getFullUser(put_username,put_password);

            if (aux!=null) {

                if (aux.getUser_isAdmin() == true) {
                    Menu.menu_admin(misPj,misCustom,db,aux,fpj,fcustom,fuser);
                
                } else {
                    Menu.menu_user(misPj, misCustom, aux, fcustom);
            
                }
            }
            else {
                System.out.println("\nUsuario o contraseña incorrecta.");
            }

        }
    }
}
