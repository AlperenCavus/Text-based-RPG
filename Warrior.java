package textBasedRPG;

public class Warrior extends GameClasses implements Classes {
	String[] spells= {"Raging Blow","Mortal Strike","Revenge","Heroic Leap"};
	double maxHP=20.0;
	double rage=100;
	double speed=8;
	int intellect=10;
	int str=12;
	int agi=10;
	int dex=10;
	Weapon sword= new Weapon_Sword();
	Warrior(){
		
		}
	@Override
	public void attack() {
		System.out.println("You tried to attack...");
		int attackChance=(int)(Math.random()*100);
		if(attackChance>=35) {
			System.out.println("You successfully attacked your target!");
			System.out.println("Given damage:"+this.getDamage());
			}
		else 
			System.out.println("You couldn't hit your target!");
		
	}

	@Override
	public void defend() {
		System.out.println("You tried to defense yourself...");
		int defenseChance=(int)(Math.random()*100);
		if(defenseChance>=50)
			System.out.println("You successfully defend yourself!");
		else 
			System.out.println("You couldn't defense yourself!");
		
	}

	@Override
	public void flee() {
		System.out.println("You tried to flee...");
		int fleeChance=(int)(Math.random()*100);
		if(fleeChance>=50)
			System.out.println("You successfully fled!");
		else 
			System.out.println("You couldn't flee!");
		
	}
	@Override
	public void critChance() {
		attack();
		int critChance=(int)Math.random()*100; 
		if(critChance >=95) 
			this.damage*=2;
		System.out.println("Crit attack!");
	}

	
	
	
	
	

}