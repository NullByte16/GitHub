package Car;
import java.util.*;

public class CarRace {

	private Car[] c = new Car[10];
	
	//Method that returns a random number.
	//This method represents the next move a Car makes.
	public int dice(){
		return (int)(Math.random()*(4 - 1 + 1)) + 1;
	}
	
	//Method that checks if a Car is out of the game (speed = 0).
	public boolean inRace(int i){
		if (c[i].getSpeed() == 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	//Method that checks if a car has crossed the finish line.
	public String winner(int i){
			if (c[i].getIndex() == 30){
				return c[i].getLicense();
			}
			else{
				return "No winner yet...";
			}
	}
	
	//Method that imitates the car race.
	public String race(){
		double speed, maxSpeed;
		
		while (true){
			for (int i = 0; i < c.length; i++){
				if (inRace(i) == false){
					i++;
				}
				if  (dice() == 1){
					c[i].setSpeed(c[i].getSpeed() + 10);
				}
				else if (dice() == 2){
					c[i].setSpeed(c[i].getSpeed() - 10);				
				}
				else if (dice() == 3){
					c[i].setSpeed(c[i].getSpeed() - 20);					
				}
				else {
					c[i].setSpeed(0);					
				}
				
				maxSpeed = c[i].getMaxSpeed();
				speed = c[i].getSpeed();
				
				if (maxSpeed - speed > maxSpeed / 2 && maxSpeed - speed < maxSpeed - maxSpeed / 5){
					c[i].setIndex(c[i].getIndex() + 1);
				}
				else if(maxSpeed - speed < maxSpeed / 2){
					c[i].setIndex(c[i].getIndex() + 0.5);
				}
				else{
					c[i].setIndex(c[i].getIndex() + 2);
				}
				if (winner(i) == c[i].getLicense()){
					return winner(i);
				}
			}
		}
	}
}