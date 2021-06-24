package model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class UserDataBase implements Serializable {
    private HashMap<Integer,User> userList;

  ///***============================CONSTRUCTORES============================***///
    public UserDataBase (){
        userList = new HashMap<Integer,User>();
    }

  ///***============================FUNCIONES============================***///
    
    /**
     * Funcion para obtener a un usuario si sus datos coinciden con lo guardado en la Coleccion de usuarios, de no coincidir, devuelve un null.
     * @param username - String con nombre de usuario introducido
     * @param password - String con contraseña introducida.
     * @return <b>variable tipo User con el usuario introducido.</b>
     */
    
    public User getFullUser(String username,String password) ///Funcion para retornar el usuario cuando sus datos sean los correctos, tanto username como contraseÃ±a.
    {

        User answer = null;

        Iterator it= userList.entrySet().iterator();

        while (it.hasNext())
        {
            Map.Entry me =(Map.Entry) it.next();

            if (((User) me.getValue()).getUser_username().equals(username) && ((User) me.getValue()).getUser_password().equals(password))
            {
                answer = (User) me.getValue();
            }

        }
        return answer;
    }

    /**
     * Funcion para obtener a un usuario si su username coincide con lo guardado en la Coleccion de usuarios, de no coincidir, devuelve un null.
     * @param username - String con nombre de usuario introducido.
     * @return <b>variable tipo User con el usuario introducido.</b>
     */
    
    public User getFullUserWithUsername(String username) //Igual que la anterior, pero retorna el usuario solo poniendo el username
    {

        User answer = null;

        Iterator it= userList.entrySet().iterator();

        while (it.hasNext())
        {
            Map.Entry me =(Map.Entry) it.next();
            me.getValue();

            if (((User) me.getValue()).getUser_username().equals(username))
            {
                answer = (User) me.getValue();
            }

        }
        return answer;
    }

    /**
     * Comprobamos que el mail introducido para registrarse este disponible.
     * @param mail - String con mail que desea comprobar si esta disponible.
     * @return <b>booleano con true/false dependiendo si esta disponible o no.</b>
     */
    
    public boolean mail_Available(String mail) ///Funcion para comprobar que el mail puesto en el registro este disponible.
    {
        boolean answer = true;

        Iterator it= userList.entrySet().iterator();

        while (it.hasNext())
        {
            Map.Entry me =(Map.Entry) it.next();

            if (((User) me.getValue()).getUser_mail().equals(mail))
            {
                answer = false;
            }

        }
        return answer;
    }

    /**
     * Comprobamos que el username introducido para registrarse este disponible.
     * @param username - String con username que desea comprobar si esta disponible.
     * @return <b>booleano con true/false dependiendo si esta disponible o no.</b>
     */
    
    
    public boolean username_Available(String username) ///Funcion para comprobar que el username puesto en el registro este disponible.
    {
        boolean answer = true;

        Iterator it= userList.entrySet().iterator();

        while (it.hasNext())
        {
            Map.Entry me =(Map.Entry) it.next();

            if (((User) me.getValue()).getUser_username().equals(username))
            {
                answer = false;
            }

        }
        return answer;
    }
    
    public HashMap<Integer, User> getUserList() {
		return userList;
	}

   
    public void addUser(User us) {
        userList.put(us.getUser_id(), us);
    }

    
    public void list() {
        for (Map.Entry<Integer, User> entry : userList.entrySet()) {
            System.out.println("ID:" + entry.getKey() + " Datos:" + entry.getValue());
        }

    }

    public int countUser() {
        return userList.size();
    }

    public void deleteUser(User us) {
        userList.remove(us.getUser_id());
    }

    
    public User getUser(User us) {
        return userList.get(us.getUser_id());
    }





}
