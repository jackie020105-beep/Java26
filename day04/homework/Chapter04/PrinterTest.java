package Chapter04;

import java.util.Scanner;

public class PrinterTest{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Printer p = new Printer(20, true);
	p.print(25);
	p.setDuplex(false);
	p.print(10);
	}
}