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
			while(i<generate) {
				System.out.println("Which direction do you want to go? \n1-North \n2-South \n3-East \n4-West");
				int choice=scan.nextInt();
				i++;
				
			}
			Random r=new Random();
			int generate2=random.nextInt(3)+1;
			switch(generate2) {
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

			 fight(creature,player);
			 
			 
			 
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
			TimeUnit.SECONDS.sleep(1);
			if( creature.getDex()> player.getDex()) {
				
				while( creature.getMaxHP()>=0 &&  player.getMaxHP()>=0) {
					TimeUnit.SECONDS.sleep(1);
					 player.setMaxHP( player.getMaxHP()- creature.fight());
					if( player.getMaxHP()<=0) {
						System.out.println("You died! Game is over!");
						status(creature,player);
						return 0;
					}
					 creature.setMaxHP( creature.getMaxHP()- player.fight());
					 status(creature,player);
				}

			}
			else if( player.getDex()> creature.getDex()) {

				while(creature.getMaxHP()>=0 && player.getMaxHP()>=0) {
					TimeUnit.SECONDS.sleep(1);
					creature.setMaxHP(creature.getMaxHP()-player.fight());
					if(creature.getMaxHP()<=0) {
						System.out.println("The creature is dead. You beat it!");
						status(creature,player);
						return 1;
					}
					player.setMaxHP(player.getMaxHP()-creature.fight());
					status(creature,player);
				}
			}
			else {
				while(creature.getMaxHP()>=0 && player.getMaxHP()>=0) {
					TimeUnit.SECONDS.sleep(1);
					creature.setMaxHP(creature.getMaxHP()-player.fight());
					if(creature.getMaxHP()<=0) {
						System.out.println("The creature is dead. You beat it!");
						status(creature,player);
						return 1;
					}
					player.setMaxHP(player.getMaxHP()-creature.fight());
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
	public int fightCheck(Creatures creature,GameClasses player) {
		
	}


}

