package model;

import java.io.Serializable;

import interfaz.IDemonAttacks;

public class Demon extends Character implements IDemonAttacks{
	private int dem_numberTransformation;
	private boolean dem_absorb;
	
	public Demon () { 
		super();
		dem_absorb = false;
		dem_numberTransformation = 0;
	}
	public Demon (String char_name, double char_ki, boolean char_isAlive, String char_planet,int dem_numberTransformation, boolean dem_absorb) {
		super(char_name, char_ki, char_isAlive, char_planet);
		this.dem_absorb = dem_absorb;
		this.dem_numberTransformation = dem_numberTransformation;
	}
	///***GETTERS***///
	
	public int getDem_numberTransformation() {
		return dem_numberTransformation;
	}
	
	public boolean isDem_absorb() {
		return dem_absorb;
	}
	
	
	///***SETTERS***///
	
	public void setDem_numberTransformation(int dem_numberTransformation) {
		this.dem_numberTransformation = dem_numberTransformation;
	}
	
	///***METHODS***///
	
	@Override
	public int hit_basic() {
		
		return super.hit_basic()*2;
	}
	@Override
	public double hit_ki() {
		
		return super.hit_ki()*2;
	}
	
	public String nam_boolean_ToString() {
		 String answer;

	        if (dem_absorb)
	        {
	            answer = "Si";
	        }
	        else {
	            answer = "No";
	        }
	        return answer;
	}
	@Override
	public String toString() {
		return super.toString()+ " Raza : Demonio  Numero de transformaciones: " + dem_numberTransformation + " Absorve :" + dem_absorb;
	}
	@Override
	public int finger_beam() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int supernova() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int chocolate_beam() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int mortal_ball() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
