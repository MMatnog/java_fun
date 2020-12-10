
public class Samurai extends Human{
	private static int numSamurai = 0;
	
	public Samurai() {
		setHealth(200);
		numSamurai++;
	}
	
	public void deathBlow(Human target) {
		target.setHealth((target.getHealth() - target.getHealth()));
		this.setHealth((target.getHealth() / 2));
	}
	
	public void meditate( ) {
		int currentHP = this.getHealth();
		this.setHealth((this.getHealth() + (currentHP / 2)));
	}
	
	public int howMany() {
		return numSamurai;
	}
}
