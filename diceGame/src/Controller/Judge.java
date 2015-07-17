package Controller;
import Person.Player;
import Person.FraudPlayer;

public class Judge {
	
	public Player player;
	public FraudPlayer fraudplayer;
	public int number;
	public int i = 1;
	Recorder recorder = new Recorder();
	public String winner;
	
	public void registGame(Player player,FraudPlayer fraudplayer){
		this.player = player;
		this.fraudplayer = fraudplayer;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public void playGame(){
		while(i<=number){
			player.playGame();
			fraudplayer.playGame(player);
			recorder.printScore(player, fraudplayer);
			i++;
		}
	}
	
	public void getWinner(){
		if(player.getTotal() > fraudplayer.getTotal()){
			winner = player.getName();
		}else{
			winner = fraudplayer.getName();
		}
		recorder.printWinner(winner);
	}

}
