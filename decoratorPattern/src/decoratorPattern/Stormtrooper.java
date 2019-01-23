package decoratorPattern;

public abstract class Stormtrooper {
	
	static String modelType = "Default Stromtrooper ";
	static String weaponType = "with standard weapons. ";
	static String mission = "Mission: Elimiate rebel scum. ";
	
	public String getModelType() {
		return modelType;
	}
	
	public String getWeaponType() {
		return weaponType;
	}
	
	public String getMission() {
		return mission;
	}

}
