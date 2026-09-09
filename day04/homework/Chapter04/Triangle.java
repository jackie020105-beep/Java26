package Chapter04;

public class Triangle {
	double base, height;

	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double findArea() {
		double half = (1%2);
		double Area;
		Area = (base*height*half);
		return Area;
	}
	public boolean isSameArea(Triangle t) {
		if(this.findArea() == t.findArea()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
