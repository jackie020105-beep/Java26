package Chapter03;

import java.util.Scanner;

public class Challenge02 {

	public static void main(String[] args) {
		int result=1;
		int n;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("팩토리얼 값을 구할 정수를 입력하시오 : ");
		n = sc.nextInt();
		
		result = factorial(n);
		
		System.out.println(result);
	}
	
	public static int factorial(int x) {
		int r = 1;
		while(x>0) {
			r *= x;
			--x;
		}
		return r;
	}
	
}