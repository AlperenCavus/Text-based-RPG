package textBasedRPG;
import java.util.Random;
import textBasedRPG.GameClasses;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Gameplay  {

	Creatures creature;
	GameClasses player;
	public Gameplay(GameClasses player){
		 this.player=player;
		
	}

	Scanner scan= new Scanner(System.in);
	Random random;
	public void start(GameClasses player) throws InterruptedException {
		while(true) {
			random=new Random();
			int generate=random.nextInt(5)+1;
			int i=0;
			while(i<generate) {// "Which direction do you want to go?" question will be asked until i is equal to the generate variable
				System.out.println("Which direction do you want to go? \n1-North \n2-South \n3-East \n4-West");
				int choice=scan.nextInt();
				i++;
				
			}
			Random r=new Random();
			int generate2=random.nextInt(3)+1;
			switch(generate2) { // in here we use dynamic polymorphism the creature that will be created is based on the random generated number
			case 1:
				 creature=new Orc("Orc");
				break;
			case 2:
				 creature=new Demon("Demon");
				break;
			case 3:
				 creature=new Zombie("Zombie");
				break;
			}

			 fight(creature,player);//This method is for starting the fight.
			 
			 
			 
		}
	}

	public int fight(Creatures creature,GameClasses player) throws InterruptedException {
		//returns 1 if player wins otherwise returns 0.
		System.out.println("You have encountered a creature!");
		System.out.println("Your dex:"+player.getDex()+"        " +creature.getName()+"'s dex:"+creature.getDex());
		
		if(creature.getDex()>player.getDex()) {

			System.out.println(creature.getName()+" will start first!");
			status(creature,player);

		}
		else if(player.getDex()>creature.getDex()) {
			System.out.println(player.getName()+" will start first");
			status(creature,player);
		}
		else {
			System.out.println(player.getName()+" will start first");
			status(creature,player);
		}

		TimeUnit.SECONDS.sleep(3);
		while( creature.getMaxHP()>=0 &&  player.getMaxHP()>=0) {
			TimeUnit.SECONDS.sleep(1); // adding 1 second delay
			if( creature.getDex()> player.getDex()) { // if creature's dex ability is higher this code block will be executed
				
				while( creature.getMaxHP()>=0 &&  player.getMaxHP()>=0) { 
					TimeUnit.SECONDS.sleep(1);// adding 1 second delay
					 player.setMaxHP( player.getMaxHP()- creature.fight());//player's health point is set by setMaxHP method in here
					if( player.getMaxHP()<=0) {//if player's health point is equal or lower than zero this code block will be executed
						System.out.println("You died! Game is over!");
						status(creature,player);
						return 0;
					}
					 creature.setMaxHP( creature.getMaxHP()- player.fight());//creature's health point is set by setMaxHP method in here
					 status(creature,player);
				}

			}
			else if( player.getDex()> creature.getDex()) {// if player's dex ability is higher this code block will be executed

				while(creature.getMaxHP()>=0 && player.getMaxHP()>=0) {
					TimeUnit.SECONDS.sleep(1);
					creature.setMaxHP(creature.getMaxHP()-player.fight()); //creature's health point is set by setMaxHP method in here
					if(creature.getMaxHP()<=0) {//if creature's health point is equal or lower than zero this code block will be executed
						System.out.println("The creature is dead. You beat it!");
						status(creature,player);
						return 1;
					}
					player.setMaxHP(player.getMaxHP()-creature.fight());//player's health point is set by setMaxHP method in here
					status(creature,player);
				}
			}
			else {// if player's and creature's dex abilities are equal this code block will be executed and player will attack first
				while(creature.getMaxHP()>=0 && player.getMaxHP()>=0) {
					TimeUnit.SECONDS.sleep(1);//adding 1 second delay
					creature.setMaxHP(creature.getMaxHP()-player.fight()); //creature's health point is set by setMaxHP method in here
					if(creature.getMaxHP()<=0) {//if creature's health point is equal or lower than zero this code block will be executed
						System.out.println("The creature is dead. You beat it!");
						status(creature,player);
						return 1;
					}
					player.setMaxHP(player.getMaxHP()-creature.fight());//player's health point is set by setMaxHP method in here
					status(creature,player);
				}

			}
		}
		return 1;
	}
	public void status(Creatures creature,GameClasses player){
		System.out.println("Your health:"+player.getMaxHP());
		System.out.println(creature.getName()+"'s health:"+creature.getMaxHP());
	}
	


}

