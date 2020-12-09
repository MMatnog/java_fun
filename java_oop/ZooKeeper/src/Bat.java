
public class Bat extends Mammal{
	
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Flap! Flap! Flying! Spent 50 Energy!");
		this.energyLevel = this.energyLevel - 50;
		displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("Noom noom! Gained 25 Energy!");
		this.energyLevel = this.energyLevel + 25;
		displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("Burn baby Burn! Spent 100 Energy!");
		this.energyLevel = this.energyLevel - 100;
		displayEnergy();
	}
}
