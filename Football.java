package FootBall;

public class Football {
public Football() {}
	
	public void play() {
		player[] players = new player[3];
		players[0] = new QuarterBack("Russel Wilson");
		players[1] = new Receiver("Tyler Lockett");
		players[2] = new LineMan("BJ Finney");
		
		System.out.println("***** Offencive Plays *****");
		displayPlays(players);
		turnover(players);
		System.out.println("\n***** Defencive Plays *****");
		displayPlays(players);
		
	}
	
	public void displayPlays(player[] players) {
		for(player player : players) {
			System.out.println(player.Name + " " + player.play());
		}
	}
	
	public void turnover(player[] players) {
		for(player player : players) {
			player.turnover();
		}
	}
	
	public static void main(String[] args) {
		Football football = new Football();
		football.play();
	}
}
