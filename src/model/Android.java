package model;

import java.io.Serializable;

import interfaz.IAndroidAttacks;

public class Android extends Character implements IAndroidAttacks {
	private String and_creator ;
	
	///***============================CONSTRUCTORES============================***///
	
	public Android() {
		super(); 
		and_creator = "Red Ribbon";
	}
	
	public Android(String char_name, double char_ki, boolean char_isAlive, String char_planet, String and_creator) {
		super(char_name,char_ki,char_isAlive,char_planet);
		this.and_creator = and_creator;
	}
	
	///***============================GETTERS============================***///
	
	public String getAnd_creator() {
		return and_creator;
	}

	///***============================SETTERS============================***///

	public void setAnd_creator(String and_creator) {
		this.and_creator = and_creator;
	}


	///***============================FUNCIONES DE LA INTERFAZ============================***///	
	
	/**
	 * Muestra el ataque basico de un androide.
	 */
	
	@Override
	public int hit_basic() {
		
		return super.hit_basic()*3;
	}

	/**
	 * Muestra el ataque especial de un androide.
	 */
	
	@Override
	public double hit_ki() {
		
		return super.hit_ki()*3;
	}
	
	///***IAndroidAttacks***///

	/**
	 * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String barrage() {
		String msg = "Barrera de Energia: ";
		return msg.concat("10000");
	}

	/**
	 * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String infinity_bullet() {
		String msg = "Bala Infinita: ";
		return msg.concat("3000");
	}

	/**
	 * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String power_wave() {
		String msg = "Onda de Poder: ";
		return msg.concat("6000");
	}

	/**
	  * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String absorb_power() {
		String msg = "Absorber poder: ";
		return msg.concat(" total absorbido: 1000: "+getChar_ki()+1000);
	}

	///***============================FUNCIONES============================***///
	

	@Override
	public String toString() {

		return super.toString()+" | Raza: Androide " + " | Creador : "+and_creator + " | Ataque del dia: " + ataqueAlAzar();
	}
	
	/**
	 * 
	 * Devuelve un ataque al azar para mostrar, mediante un random que genera un numero del 1 a total de ataques totales.
	 * @return <b>el ataque que salió</b>
	 */
	
	public String ataqueAlAzar() 
	{
		String msg="";
		int eleccion=(int)(Math.random() * 4 + 1);
		switch (eleccion)
		{
			case 1:
				msg = barrage();
				break;
				
			case 2:
				msg = infinity_bullet();
				break;
			
			case 3:
				msg = power_wave();
				break;
				
			case 4:
				msg = absorb_power();
				break;
		}
		
		return msg;
	}
}
