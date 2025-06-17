package model;

public class twoD_Game {

	public static void main(String[] args) {
		// Board gets set up in these;
		Player playerP = new Player();
		AI aiA = new AI();
		
		startGameLoop(playerP,aiA);
		
	}
	private static void startGameLoop(Player p, AI a) {
		//p.placeShips();
		//p.attack();
		//a.attack();
	}

}
