package model;

public class Custom extends Character{
	private int eyes;
	private int hair;
	private int aura;
	private int skin;
	private int mouth;
	private int nose;
	private int race;
	private int gender;
	
	
	public Custom () {
		super();
		eyes = 0;
		hair = 0;
		aura = 0;
		skin = 0;
		mouth = 0;
		nose = 0;
		race = 0;
		gender = 0 ;
		
	}

	public Custom (String char_name, double char_ki, boolean char_isAlive, String char_planet,int eyes,int hair,int mouth,int nose,int skin,int aura,int gender,int race) {
		super(char_name, char_ki, char_isAlive, char_planet);
		this.aura = aura ;
		this.eyes = eyes;
		this.gender = gender;
		this.hair = hair;
		this.mouth = mouth;
		this.nose = nose;
		this.skin = skin;
		this.race = race;

	}

	///***GETTERS***///

	public int getEyes() {
		return eyes;
	}
	public int getHair() {
		return hair;
	}
	public int getAura() {
		return aura;
	}
	public int getSkin() {
		return skin;
	}
	public int getMouth() {
		return mouth;
	}
	public int getNose() {
		return nose;
	}
	public int getRace() {
		return race;
	}
	public int getGender() {
		return gender;
	}

	///***SETTERS*///

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public void setHair(int hair) {
		this.hair = hair;
	}

	public void setAura(int aura) {
		this.aura = aura;
	}

	public void setSkin(int skin) {
		this.skin = skin;
	}

	public void setMouth(int mouth) {
		this.mouth = mouth;
	}

	public void setNose(int nose) {
		this.nose = nose;
	}

	public void setRace(int race) {
		this.race = race;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return super.toString()+ " | Ojos: " + eyes + " | Pelo: " + hair + " | Aura: " + aura + " | Piel: " + skin + " | Boca: " + mouth
				+ " | Nariz: " + nose + " | Raza: " + race + " | Genero: " + gender;
	}
	
	
}
