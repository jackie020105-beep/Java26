package Chapter03;

import java.text.BreakIterator;
import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("양의 정수를 입력하시오 : ");
		int num = sc.nextInt();
		if(isPrime(num)) {
			System.out.print(num + "는 소수입니다");
		}
		else {
			System.out.print(num + "는 소수가 아닙니다");
		}
		
		
	}
	public static boolean isPrime(int num) {
		if (num<=1) {
			return false;
		}
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
			}
		return true;
		
	}
}
