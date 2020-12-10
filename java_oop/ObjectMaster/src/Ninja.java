
public class Ninja extends Human{
	
	public Ninja() {
		setStealth(10);
	}
	
	public void steal(Human target) {
		target.setHealth((target.getHealth() - this.getStealth()));
		this.setHealth((this.getHealth() + this.getHealth()));
	}
	
	public void runAway() {
		this.setHealth((this.getHealth() - 10));
	}
}
