package homework;

import java.text.BreakIterator;
import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.print("등수를 입력하시오 : ");
		num = sc.nextInt();
		switch (num) {
		case 1: 
			System.out.print("아주 잘했습니다");
			break;
		case 2, 3: 
			System.out.print("잘했습니다");
			break;
		case 4, 5, 6: 
			System.out.print("보통입니다");
			break;
		
		default:
			System.out.print("노력해야겠습니다");
			break;
		}
		
	}
}
