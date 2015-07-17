package GameMain;
import java.util.Scanner;
import Controller.Judge;
import Person.FraudPlayer;
import Person.Player;

public class GameMain {
	public static void main(String args[]) {
		Judge judge = new Judge();
		Scanner scan = new Scanner (System.in);
		String name1 = scan.nextLine();
		String name2 = scan.nextLine(); 
		Player player = new Player(name1);
		FraudPlayer fraudplayer = new FraudPlayer(name2);
		
		judge.registGame(player, fraudplayer);
		judge.setNumber(5);
		judge.playGame();
		judge.getWinner();
		
		
	}

}
