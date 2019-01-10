
public class Bat extends Mammal{
	
	public Bat() {
		this.energyLevel = 300;
	}
	
	public int fly() {
		return this.energyLevel -= 50;
	}
	
	public int eatHumans() {
		return this.energyLevel += 25; 
	}
	
	public int attackTown() {
		System.out.println("Town on fire sound...");
		return this.energyLevel -= 100;
	}
}
