package model;

import java.util.Scanner;

public class Menu {

    static Scanner scanner;

    public static void menu_admin (User u)
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;


        while (eleccion==0)
        {
            System.out.println("1.Personajes");
            System.out.println("2.Usuarios");
            System.out.println("3.Creador de Personajes");

            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    menuCharacter_admin();
                    break;
                case 2:
                    menuUser_admin();
                    break;
                case 3:
                    menuCustom_admin();
                    break;
            }
            System.out.println("Desea continuar? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }

    public static void menuCharacter_admin()
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;


        while (eleccion==0)
        {
            System.out.println("Personajes");
            System.out.println("1.Agregar");
            System.out.println("2.Eliminar");
            System.out.println("3.Modificar");
            System.out.println("4.Buscar");


            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("Agregar");

                    break;
                case 2:
                    System.out.println("Eliminar");

                    break;
                case 3:
                    System.out.println("Modificar");

                    break;
                case 4:
                    System.out.println("Buscar");

                    break;
            }
            System.out.println("Desea continuar en Personajes? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }

    public static void menuUser_admin()
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;


        while (eleccion==0)
        {
            System.out.println("Usuarios");
            System.out.println("1.Agregar");
            System.out.println("2.Eliminar");
            System.out.println("3.Modificar");
            System.out.println("4.Buscar");


            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("Agregar");

                    break;
                case 2:
                    System.out.println("Eliminar");

                    break;
                case 3:
                    System.out.println("Modificar");

                    break;
                case 4:
                    System.out.println("Buscar");

                    break;
            }
            System.out.println("Desea continuar en Usuarios? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }

    public static void menuCustom_admin()
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;


        while (eleccion==0)
        {
            System.out.println("Creador de Personajes");
            System.out.println("1.Agregar");
            System.out.println("2.Eliminar");
            System.out.println("3.Buscar");


            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("Agregar");

                    break;
                case 2:
                    System.out.println("Eliminar");

                    break;
                case 3:
                    System.out.println("Buscar");

                    break;

            }
            System.out.println("Desea continuar en Creador de Personajes? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }

    ///User

    public static void menu_user (User u)
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;


        while (eleccion==0)
        {
            System.out.println("1.Personajes");
            System.out.println("2.Creador de Personajes");

            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:

                    break;
                case 2:

                    break;

            }
            System.out.println("Desea continuar? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }

    public static void menuCharacter_user()
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;


        while (eleccion==0)
        {
            System.out.println("Personajes");
            System.out.println("1.Buscar");
            System.out.println("2.Mostrar por Planeta");



            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("Buscar");

                    break;
                case 2:
                    System.out.println("Mostrar por Planeta");

                    break;

            }
            System.out.println("Desea continuar en Personajes? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }
}
