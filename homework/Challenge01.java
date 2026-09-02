package homework;

import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		int result=1;
		int n;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("팩토리얼 값을 구할 정수를 입력하시오 : ");
		n = sc.nextInt();
		
//		while(n > 0) {
//			result*=n;
//			n--;
//			}
//		
//		
//		System.out.println(result);
		
		
		while(true) {
			result*=n;
			n--;
			if (n<=0) {
				break;
				}
			}
		
		
		System.out.println(result);

	}
}