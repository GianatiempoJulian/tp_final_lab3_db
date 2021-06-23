package model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import interfaz.IList;

public class UserDataBase implements IList,Serializable {
    private HashMap<Integer,User> userList;

    public UserDataBase (){
        userList = new HashMap<Integer,User>();
    }

    ///***METODOS***///

    public User getFullUser(String username,String password) ///Funcion para retornar el usuario cuando sus datos sean los correctos, tanto username como contraseña.
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

    ///***FUNCIONES DE LA INTERFAZ***///

    @Override
    public void addUser(User us) {
        userList.put(us.getUser_id(), us);
    }

    @Override
    public void list() {
        for (Map.Entry<Integer, User> entry : userList.entrySet()) {
            System.out.println("ID:" + entry.getKey() + " Datos:" + entry.getValue());
        }

    }

    @Override
    public int countUser() {
        return userList.size();
    }

    @Override
    public void deleteUser(User us) {
        userList.remove(us.getUser_id());
    }

    @Override
    public User getUser(User us) {
        return userList.get(us.getUser_id());
    }





}
