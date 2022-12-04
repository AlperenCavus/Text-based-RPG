package textBasedRPG;

public class Rogue extends GameClasses implements Classes {
	String[] spells= {"Slash","Backstab","Assassinate","Vanish"};
	double maxHP=15.0;
	double energy=100.0;
	double speed= 10.0;
	int intellect=10;
	int str=10;
	int agi=12;
	int dex=10;
	Weapon dagger= new Weapon_Dagger();
	Rogue(){
		
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
		System.out.println("You tried to defend yourself...");
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
