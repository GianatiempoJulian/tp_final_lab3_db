package model;

import java.text.CollationElementIterator;
import java.util.HashSet;
import java.util.Scanner;

public class Menu {

    static Scanner scanner;

    public static void menu_admin (CollectionPj misPj,UserDataBase db,User u)
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
                    menuCharacter_admin(misPj);
                    break;
                case 2:
                    menuUser_admin(db);
                    break;
                case 3:
                    menuCustom_admin(misPj);
                    break;
            }
            System.out.println("Desea continuar? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }

    public static void menuCharacter_admin(CollectionPj pj)
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;
        int eleccion = 0;
        String nombre,planeta,namekType,creador; ///agtrgar do while namek
        double ki;
        boolean isAlive,isPureBlood,haveTail,isFighter,isFusion,isAbsorb;
        int nivel;



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
                    System.out.println("1.Saiyan");
                    System.out.println("2.Humano");
                    System.out.println("3.Namekiano");
                    System.out.println("4.Demonio");
                    System.out.println("5.Androide");

                    switch (opcion2)
                    {
                        case 1:
                            System.out.println("Ingrese nombre del personaje: ");
                            nombre = scanner.next();

                            System.out.println("Ingrese Ki del personaje: ");
                            ki = scanner.nextDouble();

                            System.out.println("Ingrese planeta del personaje: ");
                            planeta = scanner.next();

                            System.out.println("Ingrese su estado: ");
                            isAlive = scanner.nextBoolean();

                            System.out.println("Ingrese nivel maximo alcanzado: ");
                            nivel = scanner.nextInt();

                            System.out.println("Ingrese si tiene cola [true/false]:");
                            haveTail = scanner.nextBoolean();

                            System.out.println("Sangre pura[true/false]:");
                            isPureBlood = scanner.nextBoolean();

                            pj.addElement(new Saiyan(nombre,ki,isAlive,planeta,nivel,isPureBlood,haveTail));

                            break;

                        case 2:
                            System.out.println("Ingrese nombre del personaje: ");
                            nombre = scanner.next();

                            System.out.println("Ingrese Ki del personaje: ");
                            ki = scanner.nextDouble();

                            System.out.println("Ingrese planeta del personaje: ");
                            planeta = scanner.next();

                            System.out.println("Ingrese su estado: ");
                            isAlive = scanner.nextBoolean();

                            System.out.println("Es luchador [true/false]: ");
                            isFighter = scanner.nextBoolean();

                            pj.addElement(new Human(nombre,ki,isAlive,planeta,isFighter));
                            break;

                        case 3:
                            System.out.println("Ingrese nombre del personaje: ");
                            nombre = scanner.next();

                            System.out.println("Ingrese Ki del personaje: ");
                            ki = scanner.nextDouble();

                            System.out.println("Ingrese planeta del personaje: ");
                            planeta = scanner.next();

                            System.out.println("Ingrese su estado: ");
                            isAlive = scanner.nextBoolean();

                            System.out.println("Ingrese tipo: ");
                            namekType = scanner.next();

                            System.out.println("Ingrese si esta fusionado [true/false]");
                            isFusion = scanner.nextBoolean();

                            pj.addElement(new Namekian(nombre,ki,isAlive,planeta,namekType,isFusion));
                            break;

                        case 4:
                            System.out.println("Ingrese nombre del personaje: ");
                            nombre = scanner.next();

                            System.out.println("Ingrese Ki del personaje: ");
                            ki = scanner.nextDouble();

                            System.out.println("Ingrese planeta del personaje: ");
                            planeta = scanner.next();

                            System.out.println("Ingrese su estado: ");
                            isAlive = scanner.nextBoolean();

                            System.out.println("Ingrese nivel maximo alcanzado: ");
                            nivel = scanner.nextInt();

                            System.out.println("Ingrese si puede absorber [true/false]: ");
                            isAbsorb = scanner.nextBoolean();

                            pj.addElement(new Demon(nombre,ki,isAlive,planeta,nivel,isAbsorb));
                            break;

                        case 5:
                            System.out.println("Ingrese nombre del personaje: ");
                            nombre = scanner.next();

                            System.out.println("Ingrese Ki del personaje: ");
                            ki = scanner.nextDouble();

                            System.out.println("Ingrese planeta del personaje: ");
                            planeta = scanner.next();

                            System.out.println("Ingrese su estado: ");
                            isAlive = scanner.nextBoolean();

                            System.out.println("Ingrese nombre de su creador: ");
                            creador = scanner.next();

                            pj.addElement(new Android(nombre,ki,isAlive,planeta,creador));
                            break;

                    }

                    break;

                case 2:
                    System.out.println("Eliminar");
                    Character aux = null;
                    System.out.println("Ingrese nombre del personaje a eliminar: ");
                    nombre = scanner.next();
                    aux = (Character) pj.searchElement(nombre);
                    System.out.println("Objeto eliminado: " + pj.remove(aux));
                    break;

                case 3:
                    System.out.println("Modificar");

                    break;
                case 4:
                    System.out.println("Buscar");
                    System.out.println("Ingrese nombre del personaje a buscar: ");
                    nombre = scanner.next();
                    aux = (Character) pj.searchElement(nombre);
                    System.out.println(aux.toString());
                    break;
            }
            System.out.println("Desea continuar en Personajes? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }

    public static void menuUser_admin(UserDataBase db)
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
                    User aux = Register.register_menu(db);
                    db.addUser(aux);
                    break;
                case 2:
                    System.out.println("Eliminar");
                    System.out.println("Ingrese");
                    ///buscar usuario
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

    public static void menuCustom_admin(CollectionPj customPj)
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;
        String nombre,planeta,race,gender;
        double ki;
        boolean isAlive;
        int eye,hair,aura,skin,mouth,nose;

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

                    System.out.println("Ingrese nombre del personaje: ");
                    nombre = scanner.next();

                    System.out.println("Ingrese Ki del personaje: ");
                    ki = scanner.nextDouble();

                    System.out.println("Ingrese planeta del personaje: ");
                    planeta = scanner.next();

                    System.out.println("Ingrese su estado: ");
                    isAlive = scanner.nextBoolean();

                    System.out.println("Ingrese su estilo de ojos [1-5]: ");
                    eye = scanner.nextInt();

                    System.out.println("Ingrese su estilo de pelo [1-5]: ");
                    hair = scanner.nextInt();

                    System.out.println("Ingrese su estilo de aura [1-5]: ");
                    aura = scanner.nextInt();

                    System.out.println("Ingrese su estilo de boca [1-5]: ");
                    mouth = scanner.nextInt();

                    System.out.println("Ingrese su estilo de nariz [1-5]: ");
                    nose = scanner.nextInt();

                    System.out.println("Ingrese su estilo de piel [1-5]: ");
                    skin = scanner.nextInt();

                    System.out.println("Ingrese su raza : ");
                    race = scanner.next();

                    System.out.println("Ingrese su genero : ");
                    gender = scanner.next();

                    customPj.addElement(new Custom(nombre,ki,isAlive,planeta,eye,hair,mouth,nose,skin,aura,gender,race));
                    ///vincularlo con usuario?
                    break;

                case 2:
                    System.out.println("Eliminar");
                    System.out.println("Ingrese nombre del custom a eliminar:");
                    nombre = scanner.next();
                    Custom aux = (Custom) customPj.searchElement(nombre);
                    System.out.println("Custom eliminado: " +customPj.remove(aux));
                    break;

                case 3:
                    System.out.println("Buscar");
                    System.out.println("Ingrese nombre del custom a buscar:");
                    nombre = scanner.next();
                    Custom aux1 = (Custom) customPj.searchElement(nombre);
                    System.out.println(aux1.toString());
                    break;

            }
            System.out.println("Desea continuar en Creador de Personajes? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }

    ///User

    public static void menu_user (CollectionPj db,User u)
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
                    menuCharacter_user(db);
                    break;
                case 2:

                    break;

            }
            System.out.println("Desea continuar? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }

    public static void menuCharacter_user(CollectionPj db)
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;
        String nombre,planeta;

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
                    System.out.println("Ingrese nombre del personaje que desea buscar: ");
                    nombre = scanner.next();
                    Character aux = (Character) db.searchElement(nombre);
                    System.out.println(aux.toString());
                    break;
                case 2:
                    System.out.println("Mostrar por Planeta");
                    System.out.println("Ingrese nombre del planeta que desea mostrar sus personajes: ");
                    planeta = scanner.next();
                    System.out.println(db.showForPlanet(planeta));
                    break;

            }
            System.out.println("Desea continuar en Personajes? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }
}
