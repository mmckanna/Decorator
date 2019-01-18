package decoratorPattern;

public abstract class Stormtrooper {
	
	static String modelType = "Unknown Stormtrooper. ";
	static String weaponType = "Weapon of choice: unknown. ";
	static String mission = "Mission: Unknown. ";
	
	public static String getModelType() {
		return modelType;
	}
	
	public static String getWeaponType() {
		return weaponType;
	}
	
	public static String getMission() {
		return mission;
	}

}
