package Chapter04;

public class Dice {
	
	int face = 6;
	
	
	public int roll() {
		return (int) (Math.random() * face) + 1;
	}
}
