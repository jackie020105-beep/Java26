package Chapter03;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("철수 : ");
		String Csrp = sc.next();
		System.out.print("영희 : ");
		String Osrp = sc.next();
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

