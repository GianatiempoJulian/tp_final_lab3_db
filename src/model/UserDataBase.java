package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import interfaz.IList;

public class UserDataBase implements IList {
    private HashMap<Integer,User> userList;

    public UserDataBase (){
        userList = new HashMap<>();
    }


    public User getFullUser(String username,String password) {

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

    public User getFullUserWithUsername(String username) { //retorna el usuario solo poniendo el username

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

    public boolean mail_Available(String mail)
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

    public boolean username_Available(String username)
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

}
