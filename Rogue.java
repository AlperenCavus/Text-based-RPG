package textBasedRPG;

public class Rogue extends GameClasses implements Classes {
	private double maxHP=15.0;
	private double dex=10;
	private double damage=5;
	public double getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(double maxHP) {
		this.maxHP = maxHP;
	}

	public double getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	
	
	Rogue(String name){
		this.name=name;
		
	}
	
	@Override
	public double attack() {
		System.out.println("You tried to attack..."); 
		int attackChance=(int)(Math.random()*100); 
		if(attackChance>=10) { 
			System.out.println("You successfully attacked your target!"); 
			System.out.println("Your given damage:"+this.damage);
		}
		else 
			System.out.println("You couldn't hit your target!");
		
		return this.getDamage();
	}

	@Override
	public double fight() {
		return this.attack();
	}
	
}
