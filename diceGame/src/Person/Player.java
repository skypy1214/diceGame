package Person;
import Dice.Dice;

public class Player {
	public String name;
	public int total = 0;
	public int score;
	
	
	public Player(String name){
		
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public int getTotal(){
		return total;
	}

	public void playGame(){
		Dice dice = new Dice();
		score = dice.throwDice();
		total += score;
	}

}
