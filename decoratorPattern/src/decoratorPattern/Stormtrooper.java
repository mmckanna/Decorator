package decoratorPattern;

public abstract class Stormtrooper {
	
	static String description = "Unknown Stormtrooper. ";
	static String weaponType = "Weapon of choice: unknown. ";
	static String mission = "Mission: Unknown. ";
	
	public static String getDescription() {
		return description;
	}
	
	public static String getWeaponType() {
		return weaponType;
	}
	
	public static String getMission() {
		return mission;
	}

}
