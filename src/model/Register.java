package model;

import java.util.Scanner;

public class Register {

    static Scanner scanner;

  ///***============================FUNCIONES============================***///
    
    /**
     * Menu para registrarse.
     * @param db - Coleccion de usuarios.
     * @return <b>el usuario creado, tipo User.</b>
     */
    public static User register_menu(UserDataBase db) ///Menu para que los nuevos usuarios se registren en el sistema.
    {

        scanner = new Scanner(System.in);
        int opcion = 0;
        int codigoAdministrador = 1984; ///en manual estaria esto

        String newuser_mail = null;
        String newuser_username= null;
        String newuser_password= null;
        int codigoAdministradorPuesto=0;

        User newUser = new User();

        boolean mailAvailable=false;
        boolean usernameAvailable=false;

        System.out.println("\n===================Registro===================");

        System.out.println("Eliga opcion: ");
        System.out.println("\n1.Administrador");
        System.out.println("2.Usuario");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1: //admin
            	
            	while (codigoAdministradorPuesto != codigoAdministrador) {
                System.out.println("\nIngrese codigo de administrador: ");
                codigoAdministradorPuesto = scanner.nextInt();
            	}

                
               

                    while (!mailAvailable) { ///Comprueba que el mail no este usado
                        System.out.println("\nIngrese correo electronico: ");
                        newuser_mail = scanner.next();
                        mailAvailable = db.mail_Available(newuser_mail);
                    }

                    while (!usernameAvailable) { ///Comprueba que el username no este usado
                        System.out.println("\nIngrese nombre usuario: ");
                        newuser_username = scanner.next();
                        usernameAvailable = db.username_Available(newuser_username);
                    }

                    System.out.println("\nIngrese contraseña: ");
                    newuser_password = scanner.next();

                    newUser = new User(newuser_mail, newuser_username, newuser_password, true);

                
                break;

            case 2: //usuario normal

                System.out.println("\nIngrese correo electronico: ");
                newuser_mail = scanner.next();

                ///aca habria que hacer una comprobacion de que no existe

                System.out.println("\nIngrese nombre usuario: ");
                newuser_username = scanner.next();

                ///aca habria que hacer una comprobacion de que no existe

                System.out.println("\nIngrese contraseña: ");
                newuser_password = scanner.next();

                newUser = new User(newuser_mail, newuser_username, newuser_password, false);

                break;

        }
        return newUser;
    }
}
