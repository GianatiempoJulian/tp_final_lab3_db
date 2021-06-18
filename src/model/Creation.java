package model;

public class Creation {

    private int cre_eyes;
    private int cre_hair;
    private int cre_mouth;
    private int cre_nose;
    private int cre_skinColor;
    private int cre_aura;
    private char cre_gen;

    public Creation (){
        super();
    }


    public Creation (int cre_eyes,int cre_hair,int cre_mouth,int cre_nose,int cre_skinColor,int cre_aura,char cre_gen)
    {
        super();
        this.cre_eyes = cre_eyes;
        this.cre_hair = cre_hair;
        this.cre_mouth = cre_mouth;
        this.cre_nose = cre_nose;
        this.cre_skinColor = cre_skinColor;
        this.cre_aura = cre_aura;
        this.cre_gen = cre_gen;
    }

    public Creation (String char_name, double char_ki, boolean char_isAlive, String char_planet,int cre_eyes,int cre_hair,int cre_mouth,int cre_nose,int cre_skinColor,int cre_aura)
    {
        //super(char_name,char_ki,char_isAlive,char_planet);
        this.cre_eyes = cre_eyes;
        this.cre_hair = cre_hair;
        this.cre_mouth = cre_mouth;
        this.cre_nose = cre_nose;
        this.cre_skinColor = cre_skinColor;
        this.cre_aura = cre_aura;
        this.cre_gen = cre_gen;
    }

    ///***GETTERS***///


    public int getCre_eyes() {
        return cre_eyes;
    }

    public int getCre_hair() {
        return cre_hair;
    }

    public int getCre_mouth() {
        return cre_mouth;
    }

    public int getCre_nose() {
        return cre_nose;
    }

    public int getCre_skinColor() {
        return cre_skinColor;
    }

    public int getCre_aura() {
        return cre_aura;
    }

    public char getCre_gen() {
        return cre_gen;
    }

    ///***SETTERS***///


    public void setCre_eyes(int cre_eyes) {
        this.cre_eyes = cre_eyes;
    }

    public void setCre_hair(int cre_hair) {
        this.cre_hair = cre_hair;
    }

    public void setCre_mouth(int cre_mouth) {
        this.cre_mouth = cre_mouth;
    }

    public void setCre_nose(int cre_nose) {
        this.cre_nose = cre_nose;
    }

    public void setCre_skinColor(int cre_skinColor) {
        this.cre_skinColor = cre_skinColor;
    }

    public void setCre_aura(int cre_aura) {
        this.cre_aura = cre_aura;
    }

    public void setCre_gen(char cre_gen) {
        this.cre_gen = cre_gen;
    }

    @Override
    public String toString ()
    {
        return super.toString();
    }

}
