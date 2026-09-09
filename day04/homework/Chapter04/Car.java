package Chapter04;

public class Car {
	String color;
	static int car = 0;
	static int rcar = 0;
	
	public Car(String color) {
		this.color = color;
		car++;
		if (color.toLowerCase().equals("red")) {
			rcar++;
		}
	}
	
	public static int getNumOfCar() {
		return car;
	}
	
	public static int getNumOfRedCar() {
		return rcar;
		
	}
	
}
