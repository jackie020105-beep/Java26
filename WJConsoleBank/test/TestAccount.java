package test;

import java.util.List;

import bank.account.AccountListDao;
import bank.member.Member;
import bank.account.Account;
import bank.account.AccountDao;

public class TestAccount {

	public static void main(String[] args) {

		testAccountDao();
	}

	public static void testAccountDao() {
		AccountDao adao = new AccountListDao();
		System.out.println(">> 계좌 추가 및 계좌 목록");
        adao.save(new Account(110455115, "1234", "wonjae", 1000));
        adao.save(new Account(110455116, "1234", "curi", 10000));
        adao.save(new Account(110455117, "6789", "wonjae", 100000));
        printAccountList(adao.findAll());
        
     // 계좌 모두 찾기
        System.out.println(">> 계좌 목록");
        List<Account> alist = adao.findAll();
        
     // 계좌번호로 계좌 출력
        printAccountList(alist);
        
        System.out.println(">> 계좌번호로 계좌 찾기");
        Account a = adao.findByAccountNo(110455115);
        System.out.println(a);
        
     // 아이디로 계좌 출력
        printAccountList(alist);
        
        System.out.println(">> 아이디로 계좌 찾기");
        List<Account> a1 = adao.findByMemberId("wonjae");
        printAccountList(a1);
        
        
        
        
        
              
        System.out.println(">> 비번 변경");
        a.setAccountPassword("1111");
        adao.update(a);
        printAccountList(adao.findAll());
        
        System.out.println(">> 계좌번호 삭제");
        adao.delete(adao.findByAccountNo(110455115));
        printAccountList(adao.findAll());
	}

	private static void printAccountList(List<Account> alist) {
		for (Account a : alist) {
            System.out.println(a);
        }
		
	}

}
