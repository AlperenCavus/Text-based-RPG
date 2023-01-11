package textBasedRPG;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		 GameClasses player;
		int choiceNum=0;
		System.out.print("Please enter your nickname: ");
		String name=scan.nextLine();
		while((choiceNum!=1)&&(choiceNum!=2)&&(choiceNum!=3)) {
			System.out.println(name+", please select your class: \n1-Warrior\n2-Mage\n3-Rogue");
			choiceNum=scan.nextInt();
			if(choiceNum==1) {
				player= new Warrior(name);
				System.out.println("You have successfully created your warrior!");

			}
			else if(choiceNum==2) {
				player= new Mage(name);
				System.out.println("You have successfully created your mage!");

			}
			else if(choiceNum==3) {
				player= new Rogue(name);
				System.out.println("You have successfully created your rogue!");

			}
		}
		
		



	}
	
		
}
