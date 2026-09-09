package Chapter04;

public class Line {
	int line = 0;
	public Line(int line) {
		this.line = line;
	}
	
	
	public boolean isSanmeLine(Line b) {
		if(this.line == b.line) {
			return true;
		}
		else {
			return false;
		}
	}
}
