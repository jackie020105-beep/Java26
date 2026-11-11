package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.WJAccountService;
import bank.app.menu.StartMenu;
import bank.member.MemberMapDao;
import bank.member.MemberOracleDao;
import bank.member.MemberService;
import bank.member.WJMemberService;

public class WJConsoleBankApp {

    public static void main(String[] args) {
        MemberService ms =
                new WJMemberService(new MemberMapDao());

        AccountService as =
                new WJAccountService(new AccountListDao());

        new StartMenu(as, ms).run();
    }
}