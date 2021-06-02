package model;

public abstract class Character {
    private int char_id;
    private String char_name;
    private double char_ki;
    private boolean char_isAlive;
    private String char_planet;

    public Character (){}

    public Character (String char_name,double char_ki,boolean char_isAlive,String char_planet){
        this.char_id = (int)(Math.random()*10000000+1);
        this.char_name = char_name;
        this.char_ki = char_ki;
        this.char_isAlive = char_isAlive;
        this.char_planet = char_planet;
    }

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
}
