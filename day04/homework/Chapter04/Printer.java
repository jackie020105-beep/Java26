package Chapter04;

public class Printer {
	private int numOfPapers = 0;
	private boolean duplex;
	
	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
        this.duplex = duplex;
	}
	
	
	public void print(int amount) {
		if(duplex == true) {
			if (((amount+1)/2) > numOfPapers) {
				System.out.print("양면으로 모두 출력하려면 용지가 "+ (((amount+1)/2) - numOfPapers) +"매 부족합니다. ");
				System.out.println((numOfPapers) +"장만 출력합니다");
				numOfPapers = 0;
			}
			else {
				System.out.print("양면으로 "+ ((amount+1)/2) +"장 출력했습니다. ");
				System.out.println("현재 "+ (numOfPapers-((amount+1)/2)) +"장 남아 있습니다.");
				numOfPapers -= ((amount+1)/2);
			}
			
		}
		else if(duplex == false) {
			if (amount > numOfPapers) {
				System.out.print("단면으로 모두 출력하려면 용지가 "+ (amount - numOfPapers) +"매 부족합니다. ");
				System.out.println((numOfPapers) +"장만 출력합니다");
				numOfPapers = 0;
			}
			else if(amount <= numOfPapers) {
				System.out.print("단면으로 "+ (amount) +"장 출력했습니다. ");
				System.out.println("현재 "+ (numOfPapers-amount) +"장 남아 있습니다.");
				numOfPapers -= amount;
			}
		}

	}
	
	public boolean getDuplex() {
		return this.duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
	
}
