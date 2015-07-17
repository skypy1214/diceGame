package Dice;

import java.util.Random;

public class Dice {
	
	

	public int throwDice() {
		Random r = new Random();
		
		int score = r.nextInt(6)+1;
		return score;
	}

}
