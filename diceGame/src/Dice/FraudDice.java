package Dice;

public class FraudDice extends Dice {
	
	public static final int strong = 1,normal = 2,weak = 3;
	public int mode;
	
	public FraudDice(){
		mode = normal;
	}
	public void setMode(int mode){
		this.mode = mode;
	}
	public int getMode(){
		return mode;
	}
	
	public int throwDice(){
		int score = 0;
		score = super.throwDice();
		if(mode == weak){
			score = this.throwWeakly();
		}else if (mode == strong){
			score = this.throwStrongly();
		}
		return score;
	}
	
	public int throwWeakly(){
		int score = super.throwDice();
		while(score >= 5){
			score = super.throwDice();
		}
		
		return score;
	}
	
	public int throwStrongly(){
		int score = super.throwDice();
		while(score <= 2 ){
			score = super.throwDice();
			
		}
		return score;
	}
}