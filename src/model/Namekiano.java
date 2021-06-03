package model;

public class Namekiano extends Character{
    private String nam_class;
    private boolean nam_isFusion;

    public Namekiano (){}

    public Namekiano (String nam_class,boolean nam_isFusion){
        super();
        this.nam_class = nam_class;
        this.nam_isFusion = nam_isFusion;
    }

    public Namekiano (String char_name, double char_ki, boolean char_isAlive, String char_planet,String nam_class,boolean nam_isFusion){
        super(char_name,char_ki,char_isAlive,char_planet);
        this.nam_class = nam_class;
        this.nam_isFusion = nam_isFusion;
    }

    ///***GETTERS***///

    public String getNam_class() {
        return nam_class;
    }

    public boolean getNam_isFusion(){
        return nam_isFusion;
    }

    ///***SETTERS***///

    public void setNam_isFusion(boolean nam_isFusion) {
        this.nam_isFusion = nam_isFusion;
    }

    
}
