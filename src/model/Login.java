package model;

import java.util.Scanner;

public class Login {

    static Scanner scanner;
    public static void login_menu(CollectionPj misPj,CollectionPj misCustom,UserDataBase db) ///Menu de logeo de usuarios
    {

        scanner = new Scanner(System.in);
        int opcion = 0;
        int i = 0;
        String put_username = null;
        String put_password = null;
        User aux = null;


        System.out.println("Login:");

        db.list();

        while (aux == null) {

            System.out.println("Ingrese nombre de usuario: ");
            put_username = scanner.next();

            System.out.println("Ingrese contraseña:");
            put_password = scanner.next();

            aux = db.getFullUser(put_username,put_password);

            if (aux!=null) {

                if (aux.getUser_isAdmin() == true) {
                    Menu.menu_admin(misPj,misCustom,db,aux);
                    System.out.println("1");
                } else {
                    ///menu user
                    System.out.println("2");
                }
            }
            else {
                System.out.println("Usuario o contraseña incorrecta.");
            }

        }
    }
}
