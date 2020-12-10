
public class Wizard extends Human {
	
	public Wizard() {
		setHealth(50);
		setIntelligence(8);
	}
	
	public void heal(Human target) {
		target.setHealth((target.getHealth() + this.getIntelligence()));		
	}
	
	public void fireball(Human target) {
		int damage = this.getIntelligence() * 3;
		target.setHealth((target.getHealth() - damage));
	}
}
