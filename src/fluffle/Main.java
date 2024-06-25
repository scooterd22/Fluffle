package fluffle;

public class Main {


	public static void main(String[] args) {

		Bunny b = new Bunny(); 
		b.Name = "Tempest";
		b.Stamina = 100;
		b.Attack = 150;
		
		Monster m = new Monster();
		m.Name = "Rocky Mountian";
		m.Attack = 50;
		m.Stamina = 250;
		
		Blaze blaze = new Blaze();
		Turtle turtle = new Turtle();
		
		//working with base classes
		basicTurn(b, m);
		
		//not working with subclasses
		basicTurn(blaze, turtle);
		
	
		
	}

		//one turn of battle
		static void basicTurn(Bunny bunny, Monster monster) {
	        
				
		int monstersRemainingHP = bunny.attackMonster(monster.Stamina);
		int bunnyRemainingHP = monster.attackBunny(bunny.Stamina);
		
		
		System.out.println("The Battle is " + bunny.Name + " vs " + monster.Name);
		System.out.println(bunny.Name + " starts with " + bunny.Attack + " Attack and " + bunny.Stamina + " Staminia");
		System.out.println(monster.Name + " starts with " + monster.Attack + " Attack and " + monster.Stamina + " Staminia");
		System.out.println(monster.Name + " starts with the first attack to " + bunny.Name);
		System.out.println(monster.Name + " attacked " + bunny.Name + " for " + monster.Attack + " and now it's current HP is : " + bunnyRemainingHP);
		System.out.println("Now it is " + bunny.Name + "'s turn to attack");
		System.out.println(bunny.Name +  " attacked the " + monster.Name + " for " + bunny.Attack + " and now it's current HP is : " + monstersRemainingHP);
		System.out.println("At the end of one round of battle these are the current stats," + bunny.Name + " has " + bunnyRemainingHP);
		System.out.println(monster.Name + " has " + monstersRemainingHP);
		System.out.println("This is the end of turn 1");
			
	
	
		
		


	}

}
