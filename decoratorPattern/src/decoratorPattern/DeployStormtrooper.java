package decoratorPattern;

public class DeployStormtrooper {

	
	public static void main(String[] args) {
				
		Stormtrooper stormtrooper1 = new DefaultStormtrooper();
		System.out.println(stormtrooper1.getModelType() + stormtrooper1.getWeaponType() + stormtrooper1.getMission() + "\n");
		
		System.out.println("Promote stormtrooper to next class.\n");
		
		Stormtrooper stormtrooper2 = new Deathtrooper(stormtrooper1);
		System.out.println(stormtrooper1.getModelType() + stormtrooper1.getWeaponType() + stormtrooper1.getMission() + "\n");
		
		System.out.println("Upgrade stormtroopers weapons and promote to new class\n");
		
		Stormtrooper stormtrooper3 = new ImperialShockTrooper(stormtrooper1);
		System.out.println(stormtrooper1.getModelType() + stormtrooper1.getWeaponType() + stormtrooper1.getMission() + "\n");
		
		System.out.println("Reassigning stormtrooper to a wet weather area. Deploying new gear.\n" );
		
		Stormtrooper stormtrooper4 = new WetWeatherStormtrooper(stormtrooper1);
		System.out.println(stormtrooper1.getModelType() + stormtrooper1.getWeaponType() + stormtrooper1.getMission() + "\n");
						
		System.out.println("You sure this is where we're supposed to wait?");
	
	}

}
