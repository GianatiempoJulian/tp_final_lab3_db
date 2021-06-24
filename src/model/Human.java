package model;

import interfaz.IHumanAttacks;

public class Human extends Character implements IHumanAttacks{

	private boolean hum_fighter;
	
	///***============================CONSTRUCTORES============================***///
	
	public Human() {
		super();
		hum_fighter = false;
	}

	public Human(String char_name, double char_ki, boolean char_isAlive, String char_planet, boolean hum_fighter) {
		super(char_name, char_ki, char_isAlive, char_planet);
		this.hum_fighter = hum_fighter;
		
	}
	
	///***============================GETTERS============================***///

	public boolean get_isFighter() {
		return hum_fighter;
	}

	///***============================SETTERS============================***///
	
	public void set_isFighter(boolean hum_fighter) {
		this.hum_fighter = hum_fighter;
	}

	///***============================FUNCIONES DE LA INTERFAZ============================***///

	/**
	 * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String solar_flare() {
		String msg = "Taiyoken: ";
		return msg.concat("Enemigo cegado por 10 Segundos");
	}
	
	/**
	 * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String kaio_ken() {
		String msg="Kaio-Ken: ";
		return msg.concat(" Poder multiplicado X2.: "+getChar_ki()*2);
	}
	
	/**
	 * Invoca el ataque que se menciona en la cabecera de la funcion.
	 * @return <b>El nombre del ataque + el poder de dicho ataque</b>
	 */
	
	@Override
	public String kienzan() {
		String msg="Kien-Zan: ";
		return msg.concat("6000");
	}

	///***============================FUNCIONES============================***///

	/**
	 * Muestra el ataque basico de un humano.
	 */
	
	@Override
	public int hit_basic() {
		int retorno = 100;
		if(!hum_fighter) {
			retorno = 10;
		}
		return retorno;
	}
	
	/**
	 * Muestra el ataque especial de un humano.
	 */
	@Override
	public double hit_ki() {
		int retorno = 200;
		if(!hum_fighter) {
			retorno = 0;
		}
		return retorno;
	}
	
	@Override
	public String toString() {
		return super.toString()+"| Raza: Humano" + " | Es Guerrero? :" + boolean_ToStringYesorNo(get_isFighter())+ " | Ataque del dia: " + ataqueAlAzar() ;
	}
	
	/**
	 * 
	 * Devuelve un ataque al azar para mostrar, mediante un random que genera un numero del 1 a total de ataques totales.
	 * @return <b>el ataque que salió</b>
	 */
	
	public String ataqueAlAzar() 
	{
		String msg="";
		int eleccion=(int)(Math.random() * 3 + 1);
		switch (eleccion)
		{
			case 1:
				msg = solar_flare();
				break;
				
			case 2:
				msg = kaio_ken();
				break;
			
			case 3:
				msg = kienzan();
				break;
				
		
		}
		
		return msg;
	}
	
	///***============================BOOLEAN TO STRING============================***///
	
	/**
     * Cambia los valores de boolean a texto, en este caso para ver si es peleador o no el humano.
     * @return <b>un String con el booleano transformado a texto.</b>
     */
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
}
