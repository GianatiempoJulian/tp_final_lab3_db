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

    public void setSai_pureBlood(boolean sai_pureBlood) {
        this.sai_pureBlood = sai_pureBlood;
    }

    public void setSai_haveTail(boolean sai_haveTail) {
        this.sai_haveTail = sai_haveTail;
    }

    ///***BOOLEAN A TEXTO***///

    public String boolean_ToStringIsPureBlood(){

        String answer;

        if (sai_pureBlood)
        {
            answer = "Pura";
        }
        else {
            answer = "Mezcla";
        }
        return answer;
    }

    ///***FUNCIONES DE LA INTERFAZ***///

    @Override
	public String kamehameha() {
		String msg = "Kamehameha: ";
		return msg.concat("10000");
	}

	@Override
	public String garlick_hoo() {
		String msg = "Garlick Hoo: ";
		return msg.concat("6000");
	}

	@Override
	public String ki_blast() {
		String msg = "Bola de Ki: ";
		return msg.concat("3000");
	}

	@Override
	public String expansive_wave() {
		String msg = "Onda Expansiva: ";
		return msg.concat("8000");
	}

	///***METODOS***///
    @Override
    public String toString (){
        return super.toString()+" | Raza: Saiyan" + " | Nivel SSJ Max: " +sai_level+ "  | Sangre Pura: " +boolean_ToStringIsPureBlood()+ " | Tiene cola: "+boolean_ToStringYesorNo(getSai_haveTail())+ " | Ataque del dia: " + ataqueAlAzar();
    }
    
    public String ataqueAlAzar() ///Devuelve un ataque al azar para mostrar por dia, mediante un random que genera un numero del 1 a total de ataques totales.
	{
		String msg="";
		int eleccion=(int)(Math.random() * 4 + 1);
		switch (eleccion)
		{
			case 1:
				msg = kamehameha();
				break;
				
			case 2:
				msg = garlick_hoo();
				break;
			
			case 3:
				msg = ki_blast();
				break;
			
			case 4:
				msg = expansive_wave();
				break;		
		
		}
		
		return msg;
	}


}
