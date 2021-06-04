package model;

public class Human extends Character {

	private boolean hum_fighter;
	
	 public Human() {
		super();
		hum_fighter = false;
	}
	public Human(String char_name, double char_ki, boolean char_isAlive, String char_planet,boolean hum_fighter) {
		super(char_name, char_ki, char_isAlive, char_planet);
		this.hum_fighter = hum_fighter;
		
	}
	
	///***GETTERS***///
	public boolean isHum_fighter() {
		return hum_fighter;
	}
	
	///***METHODS***///
	@Override
	public int hit_basic() {
		int retorno = 100;
		if(!hum_fighter) {
			retorno = 10;
		}
		return retorno;
	}
	
	@Override
	public double hit_ki() {
		int retorno = 200;
		if(!hum_fighter) {
			retorno = 0;
		}
		return retorno;
	}
	
	public String hum_boolean_ToString() {
		 String answer;

	        if (hum_fighter)
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
		return super.toString()+"  Raza : Humano Guerrero :" +hum_boolean_ToString() ;
	}
}
