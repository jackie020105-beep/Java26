package test;

import java.util.List;

import bank.account.Account;
import bank.account.AccountDao;
import bank.account.AccountMapDao;


public class TestAccount {

    public static void main(String[] args) {
        testAccountDao(new AccountMapDao());
    }

    public static void testAccountDao(AccountDao adao) {

        // 계좌 추가
        System.out.println(">> 회원 추가 및 회원 목록");

        adao.save(new Account(
                1, "1111", "curi", 100000
        ));
        adao.save(new Account(
        		2, "2222", "jackie", 100000000
        ));

        printAccountList(adao.findAll());

        // 계좌 모두 찾기
        System.out.println(">> 계좌 목록");
        List<Account> alist = adao.findAll();

        // 회원 출력
        printAccountList(alist);

        System.out.println(">> 아이디로 계좌 찾기");
        Account a = adao.findById("curi");
        System.out.println(a);

        System.out.println(">> 계좌 비번 수정");
        a.setPassword("1234");
        adao.update(a);
        printAccountList(adao.findAll());

        System.out.println(">> 입금");
        a.setBalance(a.getBalance() + 12000);
        adao.update(a);
        printAccountList(adao.findAll());
        
        System.out.println(">> 출금");
        a.setBalance(a.getBalance() - 1000);
        adao.update(a);
        printAccountList(adao.findAll());
        
        System.out.println(">> 잔액 조회");
        a.getBalance();
        System.out.println(a.getBalance());
        printAccountList(adao.findAll());
        
        System.out.println(">> 계좌 삭제");
        adao.delete(adao.findById("curi"));
        printAccountList(adao.findAll());
    }

    public static void printAccountList(List<Account> alist) {
        for (Account a : alist) {
            System.out.println(a);
        }
    }
}