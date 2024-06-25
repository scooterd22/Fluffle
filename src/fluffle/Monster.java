package fluffle;

public class Monster {
 
	public String Name;
	public int Attack;
	public int Stamina;
	
	public int attackBunny(int BunnyStaminia) { 
		BunnyStaminia = BunnyStaminia - Attack;
		return BunnyStaminia;
		
	}
}
