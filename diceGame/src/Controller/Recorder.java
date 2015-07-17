package Controller;
import Person.Player;
import Person.FraudPlayer;

public class Recorder {
	public void printScore(Player player,FraudPlayer fraudPlayer){
		System.out.println("[" + player.getName() + ":" + player.getTotal() + " " + fraudPlayer.getName() + ":" + fraudPlayer.getTotal() + fraudPlayer.getMode());
	}

	public void printWinner(String winner){
		System.out.println(winner + "가 승리했습니다!");
	}
}
