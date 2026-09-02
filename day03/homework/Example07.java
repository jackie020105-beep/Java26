package homework;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		String c = input("철수");
		String y = input("영희");
		whosWin(c, y);
		
	}
	public static String input(String name) {
		Scanner sc = new Scanner (System.in);
		System.out.print(name + " : ");
		String rps = sc.next();
		return rps;
	}
	
	
	public static void whosWin(String Csrp, String Osrp) {
		if(Csrp.equals(Osrp)) {
			System.out.print("무승부입니다");
		}
		else if(Csrp.equals("s")) {
			if(Osrp.equals("r")) {
				System.out.print("영희, 승!");
			}
			else if(Osrp.equals("p")) {
				System.out.print("철수, 승!");
			}
		}
		else if(Csrp.equals("r")) {
			if(Osrp.equals("p")) {
				System.out.print("영희, 승!");
			}
			else if(Osrp.equals("s")) {
				System.out.print("철수, 승!");
			}
		}
		else if(Csrp.equals("p")) {
			if(Osrp.equals("s")) {
				System.out.print("영희, 승!");
			}
			else if(Osrp.equals("r")) {
				System.out.print("철수, 승!");
			}
		}
	}
}


