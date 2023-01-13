package textBasedRPG;
import java.util.*;
//GameClasses class is abstract because we don't want to create any object from this class. This class stands for only behaving as a super class.
public abstract class GameClasses implements Classes{

	protected double maxHP,damage,dex;
	protected String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
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
	public void setDex(double dex) {
		this.dex = dex;
	}
	
	
}
