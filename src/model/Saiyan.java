package model;

import java.io.Serializable;

import interfaz.ISaiyanAttacks;

public class Saiyan extends Character implements ISaiyanAttacks{

    private int sai_level;
    private boolean sai_pureBlood;
    private boolean sai_haveTail;

    public Saiyan (){}

    public Saiyan (int sai_level,boolean sai_pureBlood,boolean sai_haveTail){
        super();
        this.sai_level = sai_level;
        this.sai_pureBlood = sai_pureBlood;
        this.sai_haveTail = sai_haveTail;
    }

    public Saiyan (String char_name, double char_ki, boolean char_isAlive, String char_planet,int sai_level,boolean sai_pureBlood,boolean sai_haveTail){
        super(char_name,char_ki,char_isAlive,char_planet);
        this.sai_level = sai_level;
        this.sai_pureBlood = sai_pureBlood;
        this.sai_haveTail = sai_haveTail;
    }

    ///***GETTERS***///

    public int getSai_level() {
        return sai_level;
    }

    public boolean getSai_pureBlood(){
        return sai_pureBlood;
    }

    public boolean getSai_haveTail(){
        return sai_haveTail;
    }

    ///***SETTERS***///

    public void setSai_level(int sai_level) {
        this.sai_level = sai_level;
    }

    public void setSai_haveTail(boolean sai_haveTail) {
        this.sai_haveTail = sai_haveTail;
    }

    @Override
    public String toString (){
        return super.toString()+" Nivel SSJ Max: " +sai_level+ " Sangre Pura: " +boolean_ToString()+ " Tiene cola: "+boolean_ToString();
    }

	@Override
	public int kamehameha() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int garlick_hoo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ki_blast() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int expansive_wave() {
		// TODO Auto-generated method stub
		return 0;
	}



}