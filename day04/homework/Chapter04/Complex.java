package Chapter04;

public class Complex {
	double num;
	double minum;
	public Complex(double num, double minum) { 
		this.num = num;
		this.minum = minum;
	}
	public Complex(double num) { 
		this.num = num;
		this.minum = 0.0;
	}
	
	public void print() {
		System.out.println(num + " + " + minum + "i");
	}
}
