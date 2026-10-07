package bank.account;

public class Account {
	private int accountNo;
	private String accountPassword;
	private String memberId;
	private int balance;
	
	public Account(int accountNo, String accountPassword, String memberId, int balance) {
		this.accountNo = accountNo;
		this.accountPassword = accountPassword;
		this.memberId = memberId;
		this.balance = balance;
	}
	
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "[" + accountNo + "," + accountPassword + "," + memberId+ "," + balance + "]";
	}
	
}
