package textBasedRPG;

public class Demon extends Creatures implements Classes {

	String[] spells= {"Punch","Kick","Slash"};
	String name="Demon";
	double maxHP=11.0;
	double mana=100;
	double speed=6;
	int intellect=5;
	int str=12;
	int agi=8;
	int dex=6;
	Weapon sword= new Weapon_Sword();
	@Override
	public void attack() {
		
		int attackChance=(int)(Math.random()*100); 
		if(attackChance>=65) 
			System.out.println(this.name+"'s given damage:"+this.getDamage()); 
		
		
	}


	@Override
	public void flee() {
		
		int fleeChance=(int)(Math.random()*100);
		if(fleeChance>=90)
			System.out.println("It fled!");
		else 
			System.out.println("It tried to flee but this attempt was not successful!");
		
	}

	@Override
	public void defend() {
		int defenseChance=(int)(Math.random()*100);
		if(defenseChance>=60)
			System.out.println("The creature defended itself!");
		
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
