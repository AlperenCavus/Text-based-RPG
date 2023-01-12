package textBasedRPG;
import java.util.Scanner;
public class RepairStore {
	Scanner scan= new Scanner(System.in);
	int choice=0;
	final double durabilityCap=20.0;
public void greet(GameClasses player) {
	System.out.println(
player.getName()+", welcome to the repair store! Would you like to repair your weapon?");
}
public void choice() {
	System.out.println("1-Yes 2-No");
	do {
		
		   choice=scan.nextInt();
		  if(choice!=1 && choice!=2) {
			  System.out.println("Please enter a valid input");
			  
		  }
			  
		 }
		 while(choice!=1 && choice!=2);
	if(choice==2) {
		System.out.println("See you soon then!");
	}
	}
	public void repair(GameClasses player) {
		System.out.println("Repairment of your weapon will cost 3 golds");
		player.gold-=3.0;
		player.defaultWeapons.durability=durabilityCap;
	}
	
	
 


}

