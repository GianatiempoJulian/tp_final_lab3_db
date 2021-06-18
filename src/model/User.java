package model;


public class User {

    private int user_id;
    private String user_mail;
    private String user_username;
    private String user_password;
    private boolean isAdmin;
    //private Custom myCustom;

    public User(){};

    public User(String user_mail, String user_username, String user_password,boolean isAdmin)
    {
        this.user_id = (int)(Math.random() * 10000000 + 1);
        this.user_mail = user_mail;
        this.user_username = user_username;
        this.user_password = user_password;
        this.isAdmin = isAdmin;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_mail() {
        return user_mail;
    }

    public String getUser_username() {
        return user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public boolean getUser_isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString ()
    {
        return "Correo: " +user_mail+ " Nombre de Usuario: " +user_username;
    }


}
