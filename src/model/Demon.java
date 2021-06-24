package model;

import java.io.Serializable;

import interfaz.IDemonAttacks;

public class Demon extends Character implements IDemonAttacks{
	private int dem_numberTransformation;
	private boolean dem_absorb;
	
	///***============================CONSTRUCTORES============================***///
	
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

	///***============================GETTERS============================***///
	
	public int getDem_numberTransformation() {
		return dem_numberTransformation;
	}
	
	public boolean get_isAbsorb() {
		return dem_absorb;
	}

	///***============================SETTERS============================***///
	
	public void setDem_numberTransformation(int dem_numberTransformation) {
		this.dem_numberTransformation = dem_numberTransformation;
	}

	public void setDem_absorb(boolean dem_absorb) {
		this.dem_absorb = dem_absorb;
	}

	///***============================FUNCIONES DE LA INTERFAZ============================***///
	
	/**
	 * Muestra el ataque basico de un demonio.
	 */
	
	@Override
	public int hit_basic() {
		
		return super.hit_basic()*2;
	}

	/**
	 * Muestra el ataque especial de un demonio.
	 */
	
	@Override
	public double hit_ki() {
		
		return super.hit_ki()*2;
	}
	
	
	/**
	 * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String finger_beam() {
		String msg = "Disparo de dedo: ";
		return msg.concat("5000");
	}

	/**
	 * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String supernova() {
		String msg = "Supernova: ";
		return msg.concat("30000");
	}

	/**
	 * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String chocolate_beam() {
		String msg = "Rayo de chocolate: ";
		return "8000";
	}

	/**
	 * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String mortal_ball() {
		String msg = "Bola Mortal: ";
		return msg.concat("25000");
	}

	///***============================FUNCIONES====================== ======***///

	@Override
	public String toString() {
		return super.toString()+"| Raza: Demonio" + " | Numero de transformaciones: " + dem_numberTransformation + " | Absorbe :" + boolean_ToStringYesorNo(dem_absorb) + " | Ataque del dia: " + ataqueAlAzar();
	}
	
	/**
	 * 
	 * Devuelve un ataque al azar para mostrar, mediante un random que genera un numero del 1 a total de ataques totales.
	 * @return <b>el ataque que salió</b>
	 */
	
	public String ataqueAlAzar() ///Devuelve un ataque al azar para mostrar por dia, mediante un random que genera un numero del 1 a total de ataques totales.
	{
		String msg="";
		int eleccion=(int)(Math.random() * 4 + 1);
		switch (eleccion)
		{
			case 1:
				msg = mortal_ball();
				break;
				
			case 2:
				msg = chocolate_beam();
				break;
			
			case 3:
				msg = supernova();
				break;
				
			case 4:
				msg = finger_beam();
				break;
		}
		
		return msg;
	}
	
}
