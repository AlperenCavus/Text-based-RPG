package textBasedRPG;

public class Creatures extends GameClasses implements Classes {

	
	@Override
	public void attack() {
		
		int attackChance=(int)(Math.random()*100); 
		if(attackChance>=35) 
			System.out.println("Given damage:"+this.damage); 
		
		
	}


	@Override
	public void flee() {
		
		int fleeChance=(int)(Math.random()*100);
		if(fleeChance>=90)
			System.out.println("It fled!");
		else 
			System.out.println("It tried to flee but this attempt is not successful!");
		
	}

	@Override
	public void defend() {
		int defenseChance=(int)(Math.random()*100);
		if(defenseChance>=60)
			System.out.println("The creature defended itself!");
		
	}

}
