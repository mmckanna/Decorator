package decoratorPattern;

public class WetWeatherStormtrooper extends Stormtrooper {
	
	public WetWeatherStormtrooper(Stormtrooper stormtrooper1) {
		modelType = "Deploying Wet-weather gear stormtrooper. ";
		weaponType = "with E-11 Blaster rifle. ";
		mission = "Mission: Mimban campaign. ";
	}
}
