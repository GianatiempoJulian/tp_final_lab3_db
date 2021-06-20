package model;

public class Custom extends Character{
	private int eyes;
	private int hair;
	private int aura;
	private int skin;
	private int mouth;
	private int nose;
	private String race;
	private String gender;
	
	
	public Custom () {
		super();
		eyes = 1;
		hair = 1;
		aura = 1;
		skin = 1;
		mouth = 1;
		nose = 1;
		race = "human";
		gender = "null" ;
		
	}

	public Custom (String char_name, double char_ki, boolean char_isAlive, String char_planet,int eyes,int hair,int mouth,int nose,int skin,int aura,String gender,String race) {
		super(char_name, char_ki, char_isAlive, char_planet);
		this.aura = aura ;
		this.eyes = eyes;
		this.gender = gender;
		this.hair = hair;
		this.mouth = mouth;
		this.nose = nose;
		this.skin = skin;

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
	public String getRace() {
		return race;
	}
	public String getGender() {
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

	public void setRace(String race) {
		this.race = race;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return super.toString()+ " ojos: " + eyes + ", pelo: " + hair + " aura: " + aura + " skin: " + skin + " mouth: " + mouth
				+ " nose: " + nose + " race: " + race + " gender: " + gender;
	}
	
	
}
