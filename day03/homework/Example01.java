package homework;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int age;
		System.out.print("나이를 입력하시오 : ");
		age = sc.nextInt();
		if(age>=19)
			System.out.print("성년");
		else
			System.out.print("미성년");
		
	}
}
