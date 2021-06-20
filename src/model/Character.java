package model;

import java.io.Serializable;

public abstract class Character implements Serializable  {

//    private int char_id;
    private String char_name;
    private double char_ki;
    private boolean char_isAlive;
    private String char_planet;

    public Character() {
    	char_isAlive = true;
    	char_ki = 100;
    	char_name = "defecto" ;
    	char_planet = " tierra";
    }

    public Character(String char_name, double char_ki, boolean char_isAlive, String char_planet) {
//        this.char_id = (int) (Math.random() * 10000000 + 1);
        this.char_name = char_name;
        this.char_ki = char_ki;
        this.char_isAlive = char_isAlive;
        this.char_planet = char_planet;
    }

    ///***GETTERS***///

    public String getChar_name() {
        return char_name;
    }

    public double getChar_ki() {
        return char_ki;
    }

    public boolean getChar_isAlive(){
        return char_isAlive;
    }

    public String getChar_planet() {
        return char_planet;
    }

    ///***SETTERS***///

    public void setChar_name(String char_name) {
        this.char_name = char_name;
    }

    public void setChar_ki(double char_ki) {
        this.char_ki = char_ki;
    }

    public void setChar_isAlive(boolean char_isAlive) {
        this.char_isAlive = char_isAlive;
    }

    public void setChar_planet(String char_planet) {
        this.char_planet = char_planet;
    }

    ///***METODOS***///

    public int hit_basic() {
        return 100;
    }

    public double hit_ki() {
        return 200;
    }

    @Override
    public String toString(){
        return "Nombre: " +char_name+ " Ki: " +char_ki+ " Estado: " +boolean_ToStringIsAlive()+ " Planeta Nacimiento: " + char_planet + " Ataque: " +hit_basic()+ " Ataque especial :" + hit_ki();
    }

    ///***BOOLEAN A TEXTO***///

    public String boolean_ToStringIsAlive() ///Cambia los valores de boolean a texto, en este caso para ver el estado del personaje.
    {

        String answer;

        if (char_isAlive)
        {
            answer = "Vivo";
        }
        else {
            answer = "Muerto";
        }
        return answer;
    }

    public String boolean_ToStringYesorNo(boolean b) ///Cambia los valores de boolean a texto, en este caso para booleans que necesiten un si o no.
    {

        String answer;

        if (b)
        {
            answer = "Si";
        }
        else {
            answer = "No";
        }
        return answer;
    }




}
