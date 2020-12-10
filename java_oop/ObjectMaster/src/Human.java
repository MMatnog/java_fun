
public class Human {
	protected int strength;
	protected int intelligence;
	protected int stealth;
	protected int health;
	
	public Human() {
		setStrength(3);
		setIntelligence(3);
		setStealth(3);
		setHealth(100);
	}
	
	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the stealth
	 */
	public int getStealth() {
		return stealth;
	}

	/**
	 * @param stealth the stealth to set
	 */
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	public void attack(Human target) {
		target.setHealth((target.getHealth()-this.getStrength()));
	}
}
