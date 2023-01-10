package textBasedRPG;

public class Mage extends GameClasses implements Classes {
	private String[] spells= {"Frostbolt","Fire Whips","Arcane Bolt","Blink"};
	private double maxHP=11.0;
	private double mana=100;
	private double speed=6;
	private int intellect=12;
	private int str=10;
	private int agi=10;
	private int dex=10;
	private int gold=15;
	
	Mage(String name){
		this.name=name;
		Weapon staff= new Weapon_Staff(); 
		this.setDefaultWeapons(staff);
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


