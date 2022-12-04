package textBasedRPG;
import java.util.*;

public abstract class GameClasses {

	double hp,maxHP,mana,rage,energy,speed,damage;
	Weapon defaultWeapons;
	String[] spells;
	int str,dex,agi,intellect,points;
	
	public double getDamage() {
		return damage+getDefaultWeapons().damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public double getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(double maxHP) {
		this.maxHP = maxHP;
	}
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public double getRage() {
		return rage;
	}
	public void setRage(double rage) {
		this.rage = rage;
	}
	public double getEnergy() {
		return energy;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public Weapon getDefaultWeapons() {
		return defaultWeapons;
	}
	public void setDefaultWeapons(Weapon defaultWeapons) {
		this.defaultWeapons = defaultWeapons;
	}
	public String[] getSpells() {
		return spells;
	}
	public void setSpells(String[] spells) {
		this.spells = spells;
	}
	public int getStr() {
		return str+(int)(getDefaultWeapons().str);
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDex() {
		return dex+(int)(getDefaultWeapons().dex);
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getAgi() {
		return agi+(int)(getDefaultWeapons().agi);
	}
	public void setAgi(int agi) {
		this.agi = agi;
	}
	public int getIntellect() {
		return intellect+(int)(getDefaultWeapons().intellect);
	}
	public void setIntellect(int intellect) {
		this.intellect = intellect;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
}
