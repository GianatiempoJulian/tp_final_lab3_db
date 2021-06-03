package model;

public class Namekiano extends Character {
	private String nam_type; ///tipo : comun o combatiente.
	private boolean nam_fusion;
	
	public Namekiano() {
		super();
		nam_type = "comun";
		nam_fusion =false;
	}
	public Namekiano(String char_name, double char_ki, boolean char_isAlive, String char_planet,String nam_type,boolean nam_fusion) {
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
	
	
}
