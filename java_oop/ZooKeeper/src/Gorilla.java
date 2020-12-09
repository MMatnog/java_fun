
public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("Thowing! Spent 5 Energy!");
		energyLevel = energyLevel - 5;
		displayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("Delicious banana! Gained 10 Energy!");
		energyLevel = energyLevel + 10;
		displayEnergy();
	}
	
	public void climb() {
		System.out.println("Climbing! Spent 10 Energy!");
		energyLevel = energyLevel - 10;
		displayEnergy();
	}
	
	
}
