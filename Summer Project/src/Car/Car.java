package Car;
import java.util.*;

public class Car {
	//Attributes of Car object
	private String license;
	private String company;
	private String color;
	private double speed;
	private double maxSpeed;
	private double index;
	
	//Default Constructor
	public Car(){
		this.license = null;
		this.company = null;
		this.color = null;
		this.speed = 0;
		this.maxSpeed = 0;
		this.index = 0;
	}
	
	//Constructor with parameters
	public Car(String license, String company, String color, double speed, double maxSpeed){
		this.license = license;
		this.company = company;
		this.color = color;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.index = 0;
	}
	
	//Get methods for Car attributes
	public String getLicense(){
		return this.license;
	}
	
	public String getCompany(){
		return this.company;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public double getSpeed(){
		return this.speed;
	}
	
	public double getMaxSpeed(){
		return this.maxSpeed;
	}
	
	public double getIndex(){
		return this.index;
	}
	
	//Set methods for Car attributes
	public void setLicense(String license){
		this.license = license;
	}
	
	public void setCompany(String company){
		this.company = company;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setSpeed(double speed){
		if (speed < 0){
			this.speed = 0;
		}
		else if (speed > this.maxSpeed){
			this.speed = this.maxSpeed;
		}
		else{
			this.speed = speed;
		}
	}
	
	public void setMaxSpeed(double maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	
	public void setIndex(double index){
		this.index = index;
	}
	
	//toString method
	public String toString(){
		String st = "License: " + this.license +
				"\n" + "Company: " + this.company +
				"\n" + "Color: " + this.color +
				"\n" + "Maximum Speed: " + this.maxSpeed;
		return st;
	}
	
	//Receives a Car object.
	//Returns the "License" of the Car with the highest "maxSpeed".
	public String fastCar(Car c){
		if (this.maxSpeed > c.getMaxSpeed()){
			return this.license;
		}
		
		else if (c.getMaxSpeed() > this.maxSpeed){
			return c.getLicense();
		}
		
		else{
			return "Both cars have the same maximum speed.";
		}
	}
	
	/*Receives speed variable (double).
	*
	* Prints "Race car" if speed is 20% higher than maxSpeed,
	* "Regular car" if speed is 20% lower than maxSpeed,
	* and "Family car" if speed = maxSpeed
	*/
	public String carType(double speed){
		if (this.maxSpeed - this.maxSpeed / 5 == speed){
			return "Race car";
		}
		
		else if (this.maxSpeed + this.maxSpeed / 5 == speed){
			return "Regular car";
		}
		
		else{
			return "Family car";
		}
	}
	
	
}
