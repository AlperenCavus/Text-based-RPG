package textBasedRPG;
import java.util.*;

public class Main {
// since we invoke start method in main, main method needs to throw the same exception type as the start method.
	public static void main(String[] args) throws InterruptedException { 
		Scanner scan= new Scanner(System.in);
		GameClasses player;
		int choiceNum=0; 
		
		System.out.print("Please enter your nickname: ");
		String name=scan.nextLine();
		
		while((choiceNum!=1)&&(choiceNum!=2)&&(choiceNum!=3)) { // if the choiceNum is not equal to 1-2 or 3 it will be asked until user enter a valid input
			System.out.println(name+", please select your class: \n1-Warrior\n2-Mage\n3-Rogue");
			choiceNum=scan.nextInt();
			// dynamic polymorphism
			if(choiceNum==1) { 
				 player= new Warrior(name);
				System.out.println("You have successfully created your warrior!");
				Gameplay gp= new Gameplay(player);
				gp.start(player);
			}
			else if(choiceNum==2) {
				player= new Mage(name);
				System.out.println("You have successfully created your mage!");
				Gameplay gp= new Gameplay(player);
				gp.start(player);
			}
			else if(choiceNum==3) {
				player= new Rogue(name);
				System.out.println("You have successfully created your rogue!");
				Gameplay gp= new Gameplay(player);
				gp.start(player);
			}
		}
		
		
		



	}
	
		
}
