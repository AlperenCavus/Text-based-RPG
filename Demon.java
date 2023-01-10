package textBasedRPG;

public class Demon extends Creatures implements Classes {

	private String[] spells= {"Punch","Kick","Slash"};
	private String name="Demon";
	private double maxHP=11.0;
	private double mana=100;
	private double speed=6;
	private int intellect=5;
	private int str=12;
	private int agi=8;
	private int dex=6;
	private int gold=3;
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
