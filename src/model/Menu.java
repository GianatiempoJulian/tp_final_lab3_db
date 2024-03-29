package model;

import java.io.File;
import java.net.Socket;
import java.text.CollationElementIterator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;


import files.SaveRead;

public class Menu {

    static Scanner scanner;

  ///***============================ADMINISTRADOR============================***///

    /**
     * Menu si ingresas con administrador, con todas sus funciones.
     @param misPj - Coleccion de personajes de la serie.
     * @param misCustom - Coleccion de personajes custom.
     * @param db - Coleccion de usuarios.
     * @param u - Usuario que entra en el sistema.
     * @param fpj - Archivo  de personajes de la serie.
     * @param fcustom - Archivo de personajes custom.
     * @param fuser - Archivo de usuarios.
     */
    
    public static void menu_admin (CollectionPj misPj,CollectionPj misCustom,UserDataBase db,User u,File fpj,File fcustom,File fuser) //Menu de usuario administrador.
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;


        while (eleccion==0)
        {
        	System.out.println("===================Administrador===================");
            System.out.println("\n1.Personajes");
            System.out.println("2.Usuarios");
            System.out.println("3.Creador de Personajes");

            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                   misPj = menuCharacter_admin(misPj);
                    break;
                case 2:
                	db=menuUser_admin(db);
                    break;
                case 3:
                   misCustom = menuCustom_admin(misCustom,u);
                    break;
            }
            System.out.println("\nDesea continuar? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
        System.out.println("USERLIST:");
        System.out.println(db.getUserList());
        /// primero se borran , luego se vuelven a crear .
        fpj.delete();
        fcustom.delete();
        fuser.delete();
        SaveRead.writeHash(misPj.getCollectionHashSet(), fpj);
        SaveRead.writeHash(misCustom.getCollectionHashSet(), fcustom);
        SaveRead.writeHashMap(db.getUserList(), fuser);
    
    }

    /**
     * Menu para trabajar con personajes de la serie. (ABMC)
     * @param pj - Coleccion de personajes de la serie.
     * @return <b>la coleccion nuevamente.</b>
     */
    public static CollectionPj menuCharacter_admin(CollectionPj<Character> pj) ///Menu con funciones para personajes originales de la serie.
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;
        int eleccion = 0;
        String nombre,planeta,namekType,creador; ///agtrgar do while namek
        double ki;
        boolean isAlive,isPureBlood,haveTail,isFighter,isFusion,isAbsorb;
        int nivel;
        Character aux = null;


        while (eleccion==0)
        {
        	System.out.println("===================Personajes===================");
            System.out.println("\n1.Agregar");
            System.out.println("2.Eliminar");
            System.out.println("3.Modificar");
            System.out.println("4.Buscar");


            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("\nAgregar");
                    System.out.println("\n1.Saiyan");
                    System.out.println("2.Humano");
                    System.out.println("3.Namekiano");
                    System.out.println("4.Demonio");
                    System.out.println("5.Androide");
                    opcion2 = scanner.nextInt();

                    switch (opcion2)
                    {
                        case 1:
                            System.out.println("\nIngrese nombre del personaje: ");
                            nombre = scanner.next();

                            System.out.println("\nIngrese Ki del personaje: ");
                            ki = scanner.nextDouble();

                            System.out.println("\nIngrese planeta del personaje: ");
                            planeta = scanner.next();

                            System.out.println("\nIngrese su estado: [true = vivo/false = muerto]");
                            isAlive = scanner.nextBoolean();

                            System.out.println("\nIngrese nivel maximo alcanzado: ");
                            nivel = scanner.nextInt();

                            System.out.println("\nIngrese si tiene cola [true/false]:");
                            haveTail = scanner.nextBoolean();

                            System.out.println("\nSangre pura[true/false]:");
                            isPureBlood = scanner.nextBoolean();

                            pj.addElement(new Saiyan(nombre,ki,isAlive,planeta,nivel,isPureBlood,haveTail));

                            break;

                        case 2:
                        	System.out.println("\nIngrese nombre del personaje: ");
                            nombre = scanner.next();

                            System.out.println("\nIngrese Ki del personaje: ");
                            ki = scanner.nextDouble();

                            System.out.println("\nIngrese planeta del personaje: ");
                            planeta = scanner.next();

                            System.out.println("\nIngrese su estado: [true = vivo/false = muerto]");
                            isAlive = scanner.nextBoolean();

                            System.out.println("\nEs luchador [true/false]: ");
                            isFighter = scanner.nextBoolean();

                            pj.addElement(new Human(nombre,ki,isAlive,planeta,isFighter));
                            break;

                        case 3:
                        	System.out.println("\nIngrese nombre del personaje: ");
                            nombre = scanner.next();

                            System.out.println("\nIngrese Ki del personaje: ");
                            ki = scanner.nextDouble();

                            System.out.println("\nIngrese planeta del personaje: ");
                            planeta = scanner.next();

                            System.out.println("\nIngrese su estado: [true = vivo/false = muerto]");
                            isAlive = scanner.nextBoolean();


                            System.out.println("\nIngrese tipo: ");
                            namekType = scanner.next();

                            System.out.println("\nIngrese si esta fusionado [true = vivo/false = muerto]");
                            isFusion = scanner.nextBoolean();

                            pj.addElement(new Namekian(nombre,ki,isAlive,planeta,namekType,isFusion));
                            break;

                        case 4:
                        	System.out.println("\nIngrese nombre del personaje: ");
                            nombre = scanner.next();

                            System.out.println("\nIngrese Ki del personaje: ");
                            ki = scanner.nextDouble();

                            System.out.println("\nIngrese planeta del personaje: ");
                            planeta = scanner.next();

                            System.out.println("\nIngrese su estado: [true = vivo/false = muerto]");
                            isAlive = scanner.nextBoolean();

                            System.out.println("\nIngrese nivel maximo alcanzado: ");
                            nivel = scanner.nextInt();

                            System.out.println("\nIngrese si puede absorber [true/false]: ");
                            isAbsorb = scanner.nextBoolean();

                            pj.addElement(new Demon(nombre,ki,isAlive,planeta,nivel,isAbsorb));
                            break;

                        case 5:
                        	System.out.println("\nIngrese nombre del personaje: ");
                            nombre = scanner.next();

                            System.out.println("\nIngrese Ki del personaje: ");
                            ki = scanner.nextDouble();

                            System.out.println("\nIngrese planeta del personaje: ");
                            planeta = scanner.next();

                            System.out.println("\nIngrese su estado: [true = vivo/false = muerto]");
                            isAlive = scanner.nextBoolean();

                            System.out.println("\nIngrese nombre de su creador: ");
                            creador = scanner.next();

                            pj.addElement(new Android(nombre,ki,isAlive,planeta,creador));
                            break;

                    }

                    break;

                case 2:
                    System.out.println("\nEliminar");
                    System.out.println("Ingrese nombre del personaje a eliminar: ");
                    nombre = scanner.next();
                    aux = (Character) pj.searchElement(nombre);
                    if (aux!=null)
                        System.out.println("\nObjeto eliminado: " + pj.remove(aux));
                    else
                        System.out.println("\nPersonaje no encontrado.");
                    break;

                case 3:
                    System.out.println("\nModificar");
                    System.out.println("Ingrese nombre del personaje a modificar: ");
                    nombre = scanner.next();
                    aux = (Character) pj.searchElement(nombre);
                    if (aux!=null)
                     menuModify_admin(aux);
                    else
                        System.out.println("\nPersonaje no encontrado.");
                    break;
                    
                case 4:
                    System.out.println("\nBuscar");
                    System.out.println("Ingrese nombre del personaje a buscar: ");
                    nombre = scanner.next();
                    aux = (Character) pj.searchElement(nombre);
                    if (aux!=null)
                        System.out.println(aux.toString());
                    else
                        System.out.println("\nPersonaje no encontrado.");

                    break;
            }
            System.out.println("\nDesea continuar en Personajes? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
        return pj;
        
        
    }

    /**
     * Menu para trabajar con usuarios. (ABC)
     * @param db - Coleccion de usuarios.
     * @return <b>la coleccion nuevamente.</b>
     */
    public static UserDataBase menuUser_admin(UserDataBase db) ///Menu con funciones para usuarios registrados.
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;
        String username;
        User aux = null;


        while (eleccion==0)
        {
            System.out.println("===================Usuarios===================");
            System.out.println("1.Agregar");
            System.out.println("2.Eliminar");
            System.out.println("3.Buscar");


            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("\nAgregar");
                    aux = Register.register_menu(db);
                    db.addUser(aux);
                    break;

                case 2:
                    System.out.println("\nEliminar");
                    System.out.println("Ingrese el username del usuario a eliminar:");
                    username = scanner.next();
                    aux = db.getFullUserWithUsername(username);

                    if (aux != null) ///podria ser try&catch
                        db.deleteUser(aux);
                    else
                        System.out.println("\nUsuario no encontrado.");

                    break;

                case 3:
                	System.out.println("\nBuscar");
                    System.out.println("Ingrese el username del usuario a buscar:");
                    username = scanner.next();
                    aux = db.getFullUserWithUsername(username);

                    if (aux != null)
                        System.out.println(aux.toString());
                    else
                        System.out.println("\nUsuario no encontrado.");
                    
                    break;

            }
            System.out.println("\nDesea continuar en Usuarios? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
        return db;
    }

    /**
     * Menu para trabajar con personajes custom. (ABC)
     * @param customPj - Coleccion de personajes custom.
     * @param u - Usuario que va a trabajar con el custom.
     * @return <b>la coleccion nuevamente.</b>
     */
    
    public static CollectionPj menuCustom_admin(CollectionPj customPj,User u) ///Menu con funciones para personajes custom.
    {
        ///variables para iteratuar
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;

        ///variables de character
        String nombre,planeta;
        double ki;
        boolean isAlive;

        ///variables del custom
        int eye = 0;
        int mouth= 0;
        int nose= 0;
        int hair= 0;
        int skinColor= 0;
        int aura= 0;
        String race = null;
        String gender = null;

        ///para comprobar si es 1-5.
        boolean eyeAvailable = false;
        boolean mouthAvailable = false;
        boolean noseAvailable = false;
        boolean hairAvailable = false;
        boolean skinColorAvailable = false;
        boolean auraAvailable = false;
        boolean raceAvailable = false;
        boolean genderAvailable = false;

        while (eleccion==0)
        {
        	System.out.println("===================Creador de Personaje===================");
            System.out.println("1.Agregar");
            System.out.println("2.Eliminar");
            System.out.println("3.Buscar");


            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("\nAgregar");
                    menuCustomNew_user(customPj,u);
                    break;

                case 2:
                    System.out.println("\nEliminar");
                    System.out.println("Ingrese nombre del custom a eliminar:");
                    nombre = scanner.next();
                    Custom aux = (Custom) customPj.searchElement(nombre);
                    System.out.println("\nCustom eliminado: " +customPj.remove(aux));
                    break;

                case 3:
                    System.out.println("\nBuscar");
                    System.out.println("Ingrese nombre del custom a buscar:");
                    nombre = scanner.next();
                    Custom aux1 = (Custom) customPj.searchElement(nombre);
                    if (aux1!=null)
                    	System.out.println(aux1.toString());
                    else
                    	System.out.println("Personaje no encontrado");
                    break;

            }
            System.out.println("\nDesea continuar en Creador de Personajes? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
        return customPj;
    }

  ///***============================MENUS DE MODIFICAR============================***///

    /**
     * Funcion de modificar general, depende de la raza que sea el personaje enviado, entrara a distintos sub-menus para modificar.
     * @param c- Personaje que desea modificar.
     * @return <b>el personaje modificado (Tipo Character)</b>
     */
    
    public static Character menuModify_admin (Character c) ///Menu con opciones para modificar GENERAL.
    {


        if (c instanceof Saiyan)
        {
            menuModifySaiyan_admin((Saiyan) c);
        }

        if (c instanceof Human)
        {
            menuModifyHuman_admin((Human) c);
        }

        if (c instanceof Namekian)
        {
            menuModifyNamekian_admin((Namekian) c);
        }

        if (c instanceof Demon)
        {
            menuModifyDemon_admin((Demon) c);
        }

        if (c instanceof Android)
        {
            menuModifyAndroid_admin((Android) c);
        }

        return  c;
    }

    /**
     * Menu para modificar saiyans.
     *@param c- Personaje que desea modificar.
     * @return <b>el personaje modificado (Tipo Character)</b>
     */
    
    public static Character menuModifySaiyan_admin (Saiyan c) ///Menu con opciones para modificar SAIYAN.
    {
        String name,planet;
        double ki;
        boolean isAlive,haveTail,isPureBlood;
        int opcion,booleanEleccion,maxLevelSai;
        int eleccionWhile = 0;

        while (eleccionWhile == 0) {
            System.out.println("\nQue desea modificar? ");
            System.out.println("1.Nombre");
            System.out.println("2.Ki");
            System.out.println("3.Estado");
            System.out.println("4.Planeta");
            System.out.println("5.Nivel Maximo");
            System.out.println("6.Sangre Pura");
            System.out.println("7.Tiene Cola");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nNombre actual: " + c.getChar_name());
                    System.out.println("Ingrese nombre nuevo: ");
                    name = scanner.next();
                    c.setChar_name(name);
                    break;

                case 2:
                    System.out.println("\nKi actual: " + c.getChar_ki() + " de " + c.getChar_name());
                    System.out.println("Ingrese ki nuevo: ");
                    ki = scanner.nextDouble();
                    c.setChar_ki(ki);
                    break;

                case 3:
                    System.out.println("\nEstado actual de " + c.getChar_name() + ": " + c.boolean_ToStringIsAlive());
                    System.out.println("\n�Quiere cambiarlo? [Si=0] [No=1]");
                    booleanEleccion = scanner.nextInt();
                    if (booleanEleccion == 0) ///Acá no hay tanta libertad, solo es true o false. Si es true, se pasa auto. a false, y viceversa.
                    {
                        if (c.getChar_isAlive()) {
                            c.setChar_isAlive(false);
                        } else {
                            c.setChar_isAlive(true);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nPlaneta actual: " + c.getChar_planet() + " de " + c.getChar_name());
                    System.out.println("Ingrese planeta nuevo: ");
                    planet = scanner.next();
                    c.setChar_planet(planet);
                    break;

                case 5:
                    System.out.println("\nNivel maximo actual: " + c.getSai_level() + " de " + c.getChar_name());
                    System.out.println("Ingrese nivel maximo nuevo: ");
                    maxLevelSai = scanner.nextInt();
                    c.setSai_level(maxLevelSai);
                    break;

                case 6:
                    System.out.println("\nSangre actual de " + c.getChar_name() + ": " + c.boolean_ToStringIsPureBlood());
                    System.out.println("\n�Quiere cambiarlo? [Si=0] [No=1]");
                    booleanEleccion = scanner.nextInt();
                    if (booleanEleccion == 0) {
                        if (c.getSai_pureBlood()) {
                            c.setSai_pureBlood(false);
                        } else {
                            c.setSai_pureBlood(true);
                        }
                    }
                    break;

                case 7:
                    System.out.println("\nTiene " + c.getChar_name() + " cola?: " + c.boolean_ToStringYesorNo(c.getSai_haveTail()));
                    System.out.println("\n�Quiere cambiarlo? [Si=0] [No=1]");
                    booleanEleccion = scanner.nextInt();
                    if (booleanEleccion == 0) {
                        if (c.getSai_haveTail()) {
                            c.setSai_haveTail(false);
                        } else {
                            c.setSai_haveTail(true);
                        }
                    }
                    break;
            }
            System.out.println("\nDesea seguir modificando a " +c.getChar_name() + "? [Si=0] [No=1]");
            eleccionWhile = scanner.nextInt();
        }
        return c;
    }

    /**
     * Menu para modificar humanos.
     *@param c- Personaje que desea modificar.
     * @return <b>el personaje modificado (Tipo Character)</b>
     */
    
    public static Character menuModifyHuman_admin (Human c) ///Menu con opciones para modificar HUMAN.
    {
        String name,planet;
        double ki;
        boolean isAlive,isFighter;
        int opcion,booleanEleccion;
        int eleccionWhile = 0;

        while (eleccionWhile == 0) {
            System.out.println("Que desea modificar? ");
            System.out.println("1.Nombre");
            System.out.println("2.Ki");
            System.out.println("3.Estado");
            System.out.println("4.Planeta");
            System.out.println("5.Es peleador");

            opcion = scanner.nextInt();

            switch (opcion) {
            
            case 1:
            	System.out.println("\nNombre actual: " + c.getChar_name());
            	System.out.println("Ingrese nombre nuevo: ");
            	name = scanner.next();
            	c.setChar_name(name);
            	break;

            case 2:
                System.out.println("\nKi actual: " + c.getChar_ki() + " de " + c.getChar_name());
                System.out.println("Ingrese ki nuevo: ");
                ki = scanner.nextDouble();
                c.setChar_ki(ki);
                break;

            	case 3:
            		System.out.println("\nEstado actual de " + c.getChar_name() + ": " + c.boolean_ToStringIsAlive());
            		System.out.println("\n�Quiere cambiarlo? [Si=0] [No=1]");
                	booleanEleccion = scanner.nextInt();
                	if (booleanEleccion == 0) ///Acá no hay tanta libertad, solo es true o false. Si es true, se pasa auto. a false, y viceversa.
                	{
                		if (c.getChar_isAlive()) {
                			c.setChar_isAlive(false);
                		} else {
                			c.setChar_isAlive(true);
                		}
                	}
              	 break;

            	case 4:
            		System.out.println("\nPlaneta actual: " + c.getChar_planet() + " de " + c.getChar_name());
            		System.out.println("Ingrese planeta nuevo: ");
            		planet = scanner.next();
            		c.setChar_planet(planet);
            		break;

                case 5:
                    System.out.println("Es peleador? " + c.getChar_name() + ": " + c.boolean_ToStringYesorNo(c.get_isFighter()));
                    System.out.println("¿Quiere cambiarlo? [Si=0] [No=1]");
                    booleanEleccion = scanner.nextInt();
                    if (booleanEleccion == 0) ///Acá no hay tanta libertad, solo es true o false. Si es true, se pasa auto. a false, y viceversa.
                    {
                        if (c.get_isFighter()) {
                            c.set_isFighter(false);
                        } else {
                            c.set_isFighter(true);
                        }
                    }
                    break;
            }
            System.out.println("Desea seguir modificando a " +c.getChar_name() + "? [Si=0] [No=1]");
            eleccionWhile = scanner.nextInt();
        }
        return c;
    }

    /**
     * Menu para modificar namekianos.
     *@param c- Personaje que desea modificar.
     * @return <b>el personaje modificado (Tipo Character)</b>
     */
    
    public static Character menuModifyNamekian_admin (Namekian c) ///Menu con opciones para modificar NAMEKIAN.
    {
        String name,planet,namekClass;
        double ki;
        boolean isAlive,isFusion;
        int opcion,booleanEleccion;
        int eleccionWhile = 0;

        while (eleccionWhile == 0) {
            System.out.println("\nQue desea modificar? ");
            System.out.println("1.Nombre");
            System.out.println("2.Ki");
            System.out.println("3.Estado");
            System.out.println("4.Planeta");
            System.out.println("5.Clase");
            System.out.println("6.Es fusion");
            opcion = scanner.nextInt();

            switch (opcion) {
            case 1:
                System.out.println("\nNombre actual: " + c.getChar_name());
                System.out.println("Ingrese nombre nuevo: ");
                name = scanner.next();
                c.setChar_name(name);
                break;

            case 2:
                System.out.println("\nKi actual: " + c.getChar_ki() + " de " + c.getChar_name());
                System.out.println("Ingrese ki nuevo: ");
                ki = scanner.nextDouble();
                c.setChar_ki(ki);
                break;

            case 3:
                System.out.println("\nEstado actual de " + c.getChar_name() + ": " + c.boolean_ToStringIsAlive());
                System.out.println("\n�Quiere cambiarlo? [Si=0] [No=1]");
                booleanEleccion = scanner.nextInt();
                if (booleanEleccion == 0) ///Acá no hay tanta libertad, solo es true o false. Si es true, se pasa auto. a false, y viceversa.
                {
                    if (c.getChar_isAlive()) {
                        c.setChar_isAlive(false);
                    } else {
                        c.setChar_isAlive(true);
                    }
                }
                break;

            case 4:
                System.out.println("\nPlaneta actual: " + c.getChar_planet() + " de " + c.getChar_name());
                System.out.println("Ingrese planeta nuevo: ");
                planet = scanner.next();
                c.setChar_planet(planet);
                break;
                   

                case 5:
                    System.out.println("\nClase actual: " + c.getNam_type() + " de " + c.getChar_name());
                    System.out.println("Ingrese clase nueva: ");
                    namekClass = scanner.next();
                    c.setNam_type(namekClass);
                    break;

                case 6:
                    System.out.println("\nEs fusion? " + c.getChar_name() + ": " + c.boolean_ToStringYesorNo(c.get_isfusion()));
                    System.out.println("\n�Quiere cambiarlo? [Si=0] [No=1]");
                    booleanEleccion = scanner.nextInt();
                    if (booleanEleccion == 0) ///Acá no hay tanta libertad, solo es true o false. Si es true, se pasa auto. a false, y viceversa.
                    {
                        if (c.get_isfusion()) {
                            c.setNam_fusion(false);
                        } else {
                            c.setNam_fusion(true);
                        }
                    }
                    break;
            }
            System.out.println("\nDesea seguir modificando a " +c.getChar_name() + "? [Si=0] [No=1]");
            eleccionWhile = scanner.nextInt();
        }
        return c;
    }

    /**
     * Menu para modificar demonios.
     *@param c- Personaje que desea modificar.
     * @return <b>el personaje modificado (Tipo Character)</b>
     */
    
    public static Character menuModifyDemon_admin (Demon c) ///Menu con opciones para modificar DEMON.
    {
        String name,planet;
        double ki;
        boolean isAlive,canAbsorb;
        int opcion,booleanEleccion,maxLevel;
        int eleccionWhile = 0;

        while (eleccionWhile == 0) {
            System.out.println("Que desea modificar? ");
            System.out.println("1.Nombre");
            System.out.println("2.Ki");
            System.out.println("3.Estado");
            System.out.println("4.Planeta");
            System.out.println("5.Nivel Maximo");
            System.out.println("6.Puede absorber");
            opcion = scanner.nextInt();

            switch (opcion) {
            case 1:
                System.out.println("\nNombre actual: " + c.getChar_name());
                System.out.println("Ingrese nombre nuevo: ");
                name = scanner.next();
                c.setChar_name(name);
                break;

            case 2:
                System.out.println("\nKi actual: " + c.getChar_ki() + " de " + c.getChar_name());
                System.out.println("Ingrese ki nuevo: ");
                ki = scanner.nextDouble();
                c.setChar_ki(ki);
                break;

            case 3:
                System.out.println("\nEstado actual de " + c.getChar_name() + ": " + c.boolean_ToStringIsAlive());
                System.out.println("\n�Quiere cambiarlo? [Si=0] [No=1]");
                booleanEleccion = scanner.nextInt();
                if (booleanEleccion == 0) ///Acá no hay tanta libertad, solo es true o false. Si es true, se pasa auto. a false, y viceversa.
                {
                    if (c.getChar_isAlive()) {
                        c.setChar_isAlive(false);
                    } else {
                        c.setChar_isAlive(true);
                    }
                }
                break;

            case 4:
                System.out.println("\nPlaneta actual: " + c.getChar_planet() + " de " + c.getChar_name());
                System.out.println("Ingrese planeta nuevo: ");
                planet = scanner.next();
                c.setChar_planet(planet);
                break;

                case 5:
                    System.out.println("\nNivel maximo actual: " + c.getDem_numberTransformation() + " de " + c.getChar_name());
                    System.out.println("Ingrese nivel maximo nuevo: ");
                    maxLevel = scanner.nextInt();
                    c.setDem_numberTransformation(maxLevel);
                    break;

                case 6:
                    System.out.println("\nPuede absorber? " + c.getChar_name() + ": " + c.boolean_ToStringYesorNo(c.get_isAbsorb()));
                    System.out.println("\n�Quiere cambiarlo? [Si=0] [No=1]");
                    booleanEleccion = scanner.nextInt();
                    if (booleanEleccion == 0) ///Acá no hay tanta libertad, solo es true o false. Si es true, se pasa auto. a false, y viceversa.
                    {
                        if (c.get_isAbsorb()) {
                            c.setDem_absorb(false);
                        } else {
                            c.setDem_absorb(true);
                        }
                    }
                    break;
            }
            System.out.println("\nDesea seguir modificando a " +c.getChar_name() + "? [Si=0] [No=1]");
            eleccionWhile = scanner.nextInt();
        }
        return c;
    }

    /**
     * Menu para modificar androides.
     *@param c- Personaje que desea modificar.
     * @return <b>el personaje modificado (Tipo Character)</b>
     */
    
    public static Character menuModifyAndroid_admin (Android c) ///Menu con opciones para modificar ANDROID.
    {
        String name,planet,creator;
        double ki;
        boolean isAlive;
        int opcion,booleanEleccion;
        int eleccionWhile = 0;
        while (eleccionWhile == 0) {
            System.out.println("\nQue desea modificar? ");
            System.out.println("1.Nombre");
            System.out.println("2.Ki");
            System.out.println("3.Estado");
            System.out.println("4.Planeta");
            System.out.println("5.Creador");

            opcion = scanner.nextInt();
            switch (opcion) {
            case 1:
                System.out.println("\nNombre actual: " + c.getChar_name());
                System.out.println("Ingrese nombre nuevo: ");
                name = scanner.next();
                c.setChar_name(name);
                break;

            case 2:
                System.out.println("\nKi actual: " + c.getChar_ki() + " de " + c.getChar_name());
                System.out.println("Ingrese ki nuevo: ");
                ki = scanner.nextDouble();
                c.setChar_ki(ki);
                break;

            case 3:
                System.out.println("\nEstado actual de " + c.getChar_name() + ": " + c.boolean_ToStringIsAlive());
                System.out.println("\n�Quiere cambiarlo? [Si=0] [No=1]");
                booleanEleccion = scanner.nextInt();
                if (booleanEleccion == 0) ///Acá no hay tanta libertad, solo es true o false. Si es true, se pasa auto. a false, y viceversa.
                {
                    if (c.getChar_isAlive()) {
                        c.setChar_isAlive(false);
                    } else {
                        c.setChar_isAlive(true);
                    }
                }
                break;

            case 4:
                System.out.println("\nPlaneta actual: " + c.getChar_planet() + " de " + c.getChar_name());
                System.out.println("Ingrese planeta nuevo: ");
                planet = scanner.next();
                c.setChar_planet(planet);
                break;

                case 5:
                    System.out.println("\nCreador de " + c.getChar_name() + ": " + c.getAnd_creator());
                    System.out.println("Ingrese creador nuevo: ");
                    creator = scanner.next();
                    c.setAnd_creator(creator);
                    break;

            }
            System.out.println("\nDesea seguir modificando a " +c.getChar_name() + "? [Si=0] [No=1]");
            eleccionWhile = scanner.nextInt();
        }
        return c;
    }

  ///***============================USUARIO COMUN============================***///
    

    /**
     * Menu que aparece cuando ingresas como usuario comun.
     * @param db - Coleccion de personajes de la serie.
     * @param dbCustom - Coleccion de personajes custom.
     * @param u - Usuario que ingreso
     * @param fcustom - Archivo de personajes custom.
     */
    
    public static void menu_user (CollectionPj db,CollectionPj dbCustom,User u,File fcustom) ///Menu de usuario comun.
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;


        while (eleccion==0)
        {
        	System.out.println("===================Usuario===================");
            System.out.println("\n1.Personajes");
            System.out.println("2.Creador de Personajes");

            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    menuCharacter_user(db);
                    break;
                case 2:
                   dbCustom = menuCustom_user(db,dbCustom,u);
                    break;

            }
            System.out.println("\nDesea continuar? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
        fcustom.delete();
        SaveRead.writeHash(dbCustom.getCollectionHashSet(), fcustom);
        
    }

    /**
     * Menu de personajes de la serie para usuarios comunes .
     * @param db - Coleccion de personajes de la serie.
     */
    
    public static void menuCharacter_user(CollectionPj db) ///Menu con funciones para personajes originales de la serie.
    {
        scanner = new Scanner(System.in);
        int opcion = 0;
        int eleccion = 0;
        String nombre,planeta;

        while (eleccion==0)
        {
        	System.out.println("===================Personajes===================");
            System.out.println("1.Buscar");
            System.out.println("2.Mostrar por Planeta");



            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("\nBuscar");
                    System.out.println("Ingrese nombre del personaje que desea buscar: ");
                    nombre = scanner.next();
                    Character aux = (Character) db.searchElement(nombre);
                    if(aux!=null) 
                    	System.out.println(aux.toString());
                    else
                    	System.out.println("\nNo se encontro el personaje.");
                
                    break;
                case 2:
                    System.out.println("\nMostrar por Planeta");
                    System.out.println("Ingrese nombre del planeta que desea mostrar sus personajes: ");
                    planeta = scanner.next();
                    System.out.println(db.showForPlanet(planeta));
                    break;

            }
            System.out.println("\nDesea continuar en Personajes? [Si = 0] [No = 1]");
            eleccion = scanner.nextInt();
        }
    }

    /**
     * Menu de custom, aqu� si no tienes ningun Custom vinculado a tu cuenta, solo podras entrar a la opcion de crear uno nuevo, hecho esto, tendras acceso al resto de funciones.
     * @param db - Coleccion de personajes de la serie.
     * @param dbCustom - Coleccion d personajes custom.
     * @param u - Usuario que ingreso.
     * @return <b>la coleccion de custom.</b>
     */
    public static CollectionPj<Custom> menuCustom_user (CollectionPj db,CollectionPj dbCustom,User u) ///Menu con funciones para personajes custom.
    {
        Custom aux = null;
        aux = u.getMyCustom();

        if (aux==null)
        {
            menuCustomNew_user(dbCustom,u);
        }

        menuCustomCreated_user(db,dbCustom,u);
		return dbCustom;
    }

    /**
     * Menu que aparece cuando tienes creado un custom para realizar cosas con el.
     * @param db - Coleccion de personajes de la serie
     * @param dbCustom - Coleccion de personajes custom.
     * @param u - Usuario que ingreso.
     */
    
    public static void menuCustomCreated_user (CollectionPj db,CollectionPj dbCustom,User u) ///Menu con funciones para custom ya creado.
    {
        int eleccionWhile =0;
        int opcion,opcion2;

        while (eleccionWhile==0) {
        	System.out.println("===================Creador de Personaje===================");
            System.out.println("\n1.Ver mi personaje");
            System.out.println("2.Mas fuerte que...");
            System.out.println("3.Eliminar");
            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("\nMi personaje");
                    System.out.println(u.getMyCustom().toString());
                    break;
                case 2:
                    System.out.println(u.getMyCustom().getChar_name() +" es mas fuerte que: ");
                    System.out.println(db.strongerThan(u.getMyCustom()));
                    break;
                case 3:
                    System.out.println("\nEliminando");
                    System.out.println("�Seguro que desea eliminar su personaje? No podra volver atras. [Si=0] [No=1]");
                    opcion2 = scanner.nextInt();
                    if (opcion2 == 0)
                    {
                        System.out.println("\nEliminando personaje "+u.getMyCustom().getChar_name());
                        dbCustom.remove(u.getMyCustom());
                        u.setMyCustom(null);

                    }
                    else if (opcion2 == 1)
                        System.out.println("\nPersonaje no eliminado.");

                    break;
            }
            if (u.getMyCustom() == null)
            {
            	eleccionWhile=1;
            }
            else
            {
            System.out.println("\nDesea continuar? [Si = 0] [No = 1]");
            eleccionWhile = scanner.nextInt();
            }
        }
    }

    /**
     * Menu para crear custom.
     * @param dbCustom - Coleccion de personajes custom.
     * @param u - Usuario que ingreso.
     */
    
    public static void menuCustomNew_user (CollectionPj dbCustom,User u) ///Menu con funciones para custom nuevo.
    {
        ///variables para iteratuar
        int opcion;

        ///variables character
        double ki;
        String nombre,planeta;
        boolean isAlive;

        ///variables del custom
        int eye = 0;
        int mouth= 0;
        int nose= 0;
        int hair= 0;
        int skinColor= 0;
        int aura= 0;
        int race = 0;
        int gender = 0;

        ///para comprobar si es 1-5.
        boolean eyeAvailable = false;
        boolean mouthAvailable = false;
        boolean noseAvailable = false;
        boolean hairAvailable = false;
        boolean skinColorAvailable = false;
        boolean auraAvailable = false;
        boolean raceAvailable = false;
        boolean genderAvailable = false;


        System.out.println("\n1.Nuevo Personaje");
        opcion = scanner.nextInt();

        switch (opcion)
        {
            case 1:
                System.out.println("\nIngrese nombre del personaje: ");
                nombre = scanner.next();

                System.out.println("\nIngrese Ki del personaje: ");
                ki = scanner.nextDouble();

                System.out.println("\nIngrese planeta del personaje: ");
                planeta = scanner.next();

                System.out.println("\nIngrese su estado: [true = vivo/false = muerto]");
                isAlive = scanner.nextBoolean();

                while (!eyeAvailable) {
                    System.out.println("\nIngrese su estilo de ojos [1-5]: ");
                    eye = scanner.nextInt();
                    eyeAvailable = isAvaliableOption(eye);
                }

                while (!hairAvailable) {
                    System.out.println("\nIngrese su estilo de pelo [1-5]: ");
                    hair = scanner.nextInt();
                    hairAvailable = isAvaliableOption(hair);
                }
                while (!auraAvailable)
                {
                    System.out.println("\nIngrese su estilo de aura [1-5]: ");
                    aura = scanner.nextInt();
                    auraAvailable = isAvaliableOption(aura);
                }


                while (!mouthAvailable)
                {
                    System.out.println("\nIngrese su estilo de boca [1-5]: ");
                    mouth = scanner.nextInt();
                    mouthAvailable = isAvaliableOption(mouth);
                }

                while (!noseAvailable)
                {
                    System.out.println("\nIngrese su estilo de nariz [1-5]: ");
                    nose = scanner.nextInt();
                    noseAvailable = isAvaliableOption(nose);
                }

                while (!skinColorAvailable)
                {
                    System.out.println("\nIngrese su estilo de piel [1-5]: ");
                    skinColor = scanner.nextInt();
                    skinColorAvailable = isAvaliableOption(skinColor);
                }

                while (!raceAvailable)
                {
                    System.out.println("\nIngrese su raza [1-5]: ");
                    race = scanner.nextInt();
                    raceAvailable = isAvaliableOption(race);
                }

                while (!genderAvailable)
                {
                    System.out.println("\nIngrese su genero [F=1] [M=2]: ");
                    gender = scanner.nextInt();
                    if (gender == 1 || gender ==2) 
                    	genderAvailable= isAvaliableOption(gender);
                    else
                    	System.out.println("Opcion ingresada incorrecta!");
                }

                u.setMyCustom(new Custom(nombre,ki,isAlive,planeta,eye,hair,mouth,nose,skinColor,aura,gender,race));
                dbCustom.addElement(u.getMyCustom());
            break;
        }
    }

  ///***============================FUNCIONES============================***///
    
    /**
     * Para comprobar que la eleccion que hizo el usuario este entre los parametros permitidos.
     * @param eleccion - Un int con la eleccion que realizo al elegir un atributo del personaje.
     * @return <b>booleano con respuesta de si es una opcion valida o no.</b>
     */
    public static boolean isAvaliableOption(int eleccion) 
    {
        boolean answer = false;

        if (eleccion >= 1 && 5 >= eleccion)
        {
            answer = true;
        }
        return answer;
    }

}
