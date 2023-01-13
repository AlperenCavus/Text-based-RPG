package textBasedRPG;

public class Orc extends Creatures implements Classes {
	private String name;
	private double maxHP=11.0;
	private double dex=6;
	private double damage=3;
	
	public Orc(String name) {
		this.name=name;
		
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	
	
	@Override
	public double attack() {
		
		int attackChance=(int)(Math.random()*100); 
		if(attackChance>=65) 
			System.out.println(this.name+"'s given damage:"+this.damage); 
		else {
			System.out.println("It could not hit you!");
			return 0;
		}
		return damage;
	}
	@Override
	public double fight() {
		return this.attack();
	}


}
