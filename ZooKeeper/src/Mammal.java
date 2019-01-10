
public class Mammal {
	
	public int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	} 
	
	public int displayEnergy() {
		return getEnergyLevel();
	}

}
