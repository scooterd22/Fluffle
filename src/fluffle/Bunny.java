package fluffle;

public class Bunny {
	
	public String Name;
	public int Attack;
	public int Stamina;
	public int Cost;
	
	public int attackMonster(int MonsterStaminia) { 
		MonsterStaminia = MonsterStaminia - Attack;
		return MonsterStaminia;
		
	}

}
