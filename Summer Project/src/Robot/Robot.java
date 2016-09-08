package Robot;

import java.util.*;

public class Robot {

	private String color;
	private int index;
	private boolean inGame;
	
	//Constructor
	public Robot(int[] board, String color){
		this.color = color;
		this.index = 10;
		this.inGame = true;
	}
	
	//Get methods for Robot attributes.
	public String getColor(){
		return this.color;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public boolean getInGame(){
		if (this.inGame == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Set methods for Robot attributes.
	public void setColor(String color){
		this.color = color;
	}
	
	public void setIndex(int index){
		if (index < 1){
			//This action will ensure the robot stays on the board.
			//if the robot moves back past index = 1, he will move forward.
			index = 1 - index;
		}
		else if (index > 100){
			//This action will ensure the robot stays on the board.
			//if the robot moves forward past index = 100, he will move back.
			index = 100 - (index - 100);
		}
		else{
		this.index = index;
		}
	}
	
	public void setInGame(boolean inGame){
		this.inGame = inGame;
	}
	
	//toString method.
	public String toString(){
		String st = "Color: " + this.color +
				"\n" + "Index: " + this.index +
				"\n" + "In Game: " + this.inGame;
		return st;
	}
	
	//Moves the robot one step forward.
	public void forward(){
	 setIndex(this.index++);
	}
	
	//Moves the robot one step backward.
	public void back(){
		setIndex(this.index--);
	}
	
	//Moves the robot n steps forward.
	public void forwardJump(int n){
		setIndex(this.index = this.index + n);
	}
	
	//Moves the robot n steps backward.
	public void backJump(int n){
		setIndex(this.index = this.index - n);
	}
}