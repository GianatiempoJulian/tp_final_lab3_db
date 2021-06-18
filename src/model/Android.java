package model;

import java.io.Serializable;

import interfaz.IAndroidAttacks;

public class Android extends Character implements IAndroidAttacks {
	private String and_creator ;
	
	public Android() {
		super(); 
		and_creator = "Red Ribbon";
	}
	
	public Android(String char_name, double char_ki, boolean char_isAlive, String char_planet, String and_creator) {
		super(char_name,char_ki,char_isAlive,char_planet);
		this.and_creator = and_creator;
	}
	
	///***GETTERS***///
	public String getAnd_creator() {
		return and_creator;
	}
	
	///***METHODS***///
	
	@Override
	public int hit_basic() {
		
		return super.hit_basic()*3;
	}
	@Override
	public double hit_ki() {
		
		return super.hit_ki()*3;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+" Raza: Androide"+ " Creador : "+and_creator;
	}

	@Override
	public int barrage() {
		System.out.println("You can't take THIS\n!!");
		return 10000;
	}

	@Override
	public int infinity_bullet() {
		System.out.println("This are my energy BLASTS!!");
		return 3000;
	}

	@Override
	public int power_wave() {
		System.out.println("Power WAVE!!");
		return 11000;
	}

	@Override
	public int absorb_power() {
		System.out.println("Let me ABSORB YOU!!");
		return 150;
	}
}
