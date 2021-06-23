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

	public boolean get_isfusion() {
		return nam_fusion;
	}
	
	///***SETTERS***///
	
	public void setNam_fusion(boolean nam_fusion) {
		this.nam_fusion = nam_fusion;
	}

	public void setNam_type(String nam_type) {
		this.nam_type = nam_type;
	}

	///***FUNCIONES DE LA INTERFAZ***///

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

	@Override
	public String makankosappo() {
		String msg = "Makankosappo: ";
		return msg.concat("5500");
	}

	@Override
	public String namek_fusion() {
		String msg = "Fusion Namekiana: ";
		return msg.concat("Poder incrementaria en 10000: " + getChar_ki()+10000);
	}

	@Override
	public String healing() {
		String msg = "Curacion Namekaina: ";
		return msg.concat("Poder incrementaria en 1000: " + getChar_ki()+1000);
	}

	@Override
	public String hellzone_granade() {
		String msg = "Granada infernal: ";
		return msg.concat("8200");
	}

	///***METODOS***///

	@Override
	public String toString() {
		return super.toString()+"| Raza: Namekiano"+ " | Namekiano Tipo :" + nam_type + " | Esta fusionado: " + boolean_ToStringYesorNo(get_isfusion())+ " | Ataque del dia: " + ataqueAlAzar() ;
	}
	
	public String ataqueAlAzar() ///Devuelve un ataque al azar para mostrar por dia, mediante un random que genera un numero del 1 a total de ataques totales.
	{
		String msg="";
		int eleccion=(int)(Math.random() * 4 + 1);
		switch (eleccion)
		{
			case 1:
				msg = makankosappo();
				break;
				
			case 2:
				msg = namek_fusion();
				break;
			
			case 3:
				msg = healing();
				break;
			
			case 4:
				msg = hellzone_granade();
				break;		
		
		}
		
		return msg;
	}
	
}
