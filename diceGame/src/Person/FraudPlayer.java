package Person;
import Dice.FraudDice;

public class FraudPlayer extends Player {
	
	FraudDice fraudDice = new FraudDice();
	
	public FraudPlayer(String name){
		super(name);
	}
	
	public void playGame(Player rival){
		int score = fraudDice.throwDice();
		total += score;
		changeMode(rival);
	}
	
	public String getMode(){
		int modeNumber = fraudDice.getMode();
		String mode = "";
		switch(modeNumber){
		case 1 : mode =  "[STRONG]";
		break;
		case 2 : mode =  "[NORMAL]";
		break;
		case 3 : mode =  "[WEAK]";
		break;
		}
		return mode;
	}
	public void changeMode(Player rival){
		if (this.total < rival.total){
			fraudDice.setMode(FraudDice.strong);
		}else if (((this.total)-(rival.total)) >= 6){
			fraudDice.setMode(FraudDice.weak);
		}
	}

}
