package textBasedRPG;

public class Weapon {
 double damage,durability,str,dex,agi,intellect;
 String name;
}
class Weapon_Dagger extends Weapon{
	Weapon_Dagger(){
		this.name="Sharp Dagger";
		this.durability=20.0;
		this.damage=3;
		this.agi=1;
		
	}
}
class Weapon_Staff extends Weapon{
	Weapon_Staff(){
		this.name="Mage Staff";
		this.durability=20.0;
		this.damage=1;
		this.intellect=2;
		
	}
}
class Weapon_Sword extends Weapon {

	Weapon_Sword(){
		this.name="Long Sword";
		this.durability=20.0;
		this.damage=5;
		this.str=1;
	}
}

