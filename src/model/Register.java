package model;

import java.util.Scanner;

public class Register {

    static Scanner scanner;

    public static User register_menu(UserDataBase db) ///Menu para que los nuevos usuarios se registren en el sistema.
    {

        scanner = new Scanner(System.in);
        int opcion = 0;
        int codigoAdministrador = 1984; ///en manual estaria esto

        String newuser_mail = null;
        String newuser_username= null;
        String newuser_password= null;
        int codigoAdministradorPuesto;

        User newUser = new User();

        boolean mailAvailable=false;
        boolean usernameAvailable=false;

        System.out.println("Registro: ");

        System.out.println("Eliga opcion: ");
        System.out.println("1.Admin");
        System.out.println("2.Usuario");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1: //admin

                System.out.println("Ingrese codigo de administrador: ");
                codigoAdministradorPuesto = scanner.nextInt();

                if (codigoAdministradorPuesto != codigoAdministrador) {
                    ///que muestre un error, podria ser con try catch
                } else {

                    while (!mailAvailable) { ///Comprueba que el mail no este usado
                        System.out.println("Ingrese correo electronico: ");
                        newuser_mail = scanner.next();
                        mailAvailable = db.mail_Available(newuser_mail);
                    }

                    while (!usernameAvailable) { ///Comprueba que el username no este usado
                        System.out.println("Ingrese nombre usuario: ");
                        newuser_username = scanner.next();
                        usernameAvailable = db.username_Available(newuser_username);
                    }

                    System.out.println("Ingrese contraseña: ");
                    newuser_password = scanner.next();

                    newUser = new User(newuser_mail, newuser_username, newuser_password, true);

                }
                break;

            case 2: //usuario normal

                System.out.println("Ingrese correo electronico: ");
                newuser_mail = scanner.next();

                ///aca habria que hacer una comprobacion de que no existe

                System.out.println("Ingrese nombre usuario: ");
                newuser_username = scanner.next();

                ///aca habria que hacer una comprobacion de que no existe

                System.out.println("Ingrese contraseña: ");
                newuser_password = scanner.next();

                newUser = new User(newuser_mail, newuser_username, newuser_password, false);

                break;

        }
        return newUser;
    }
}
