package model;

import java.io.Serializable;

import interfaz.INamekAttacks;

public class Namekian extends Character implements INamekAttacks, Serializable {
	private String nam_type; ///tipo : comun o combatiente.
	private boolean nam_fusion;
	 
	public Namekian() {
		super();
		nam_type = "comun";
		nam_fusion =false;
	}
	public Namekian(String char_name, double char_ki, boolean char_isAlive, String char_planet, String nam_type, boolean nam_fusion) {
		super(char_name, char_ki, char_isAlive, char_planet);
		this.nam_fusion = nam_fusion;
		this.nam_type = nam_type;
		
	}
	
	
	///***GETTERS***///
	
	public String getNam_type() {
		return nam_type;
	}
	public boolean isNam_fusion() {
		return nam_fusion;
	}
	
	///***SETTERS***///
	
	public void setNam_fusion(boolean nam_fusion) {
		this.nam_fusion = nam_fusion;
	}
	
	///***METHODS***///
	
	@Override
	public int hit_basic() {
		int retorno = 100;
		if(nam_type.equals("comun")) {
			retorno = 10;
		}
		return retorno;
	}
	
	@Override
	public double hit_ki() {
		int retorno = 200;
		if(nam_type.equals("comun")) {
			retorno = 0;
		}
		return retorno;
	}
	
	public String nam_boolean_ToString() {
		 String answer;

	        if (nam_fusion)
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
		return super.toString()+"  Raza : Namekiano Tipo :" + nam_type + ", Esta fusionado: " + nam_boolean_ToString() ;
	}
	@Override
	public int makankosappo() {
		System.out.println("There's nowhere to run, TAKE THIS!\n");
		return 5000;
	}
	@Override
	public int namek_fusion() {
		System.out.println("I will win! No matter who my opponent is, I will never lose! ... I have finally obtained maximum power!\n");
		return 10000;
	}
	@Override
	public int healing() {
		System.out.println("Don't worry I can regenerate my body..\n");
		return -100;
	}
	@Override
	public int hellzone_granade() {
		System.out.println("HELLZONE GRENADE!!\n");
		return 7000;
	}
	
	
}
