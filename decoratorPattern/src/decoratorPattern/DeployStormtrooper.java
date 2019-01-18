package decoratorPattern;

public class DeployStormtrooper {

	public static void main(String[] args) {
		
				
		Stormtrooper stormtrooper1 = new Deathtrooper();
		System.out.println(Stormtrooper.getModelType() + Stormtrooper.getWeaponType() + Stormtrooper.getMission() + "\n");
		
		Stormtrooper stormtrooper2 = new DefaultStormtrooper();
		System.out.println(Stormtrooper.getModelType() + Stormtrooper.getWeaponType() + Stormtrooper.getMission() + "\n");
		
		Stormtrooper stormtrooper3 = new WetWeatherStormtrooper();
		System.out.println(Stormtrooper.getModelType() + Stormtrooper.getWeaponType() + Stormtrooper.getMission() + "\n");
		
		Stormtrooper stormtrooper4 = new ImperialShockTrooper();
		System.out.println(Stormtrooper.getModelType() + Stormtrooper.getWeaponType() + Stormtrooper.getMission() + "\n");
		
		
		System.out.println("\nYou sure this is where we're supposed to wait?");
		
	}

}
