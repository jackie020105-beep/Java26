package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.WJAccountService;
import bank.app.menu.*;
import bank.member.MemberListDao;
import bank.member.MemberService;
import bank.member.WJMemberService;

public class WJConsoleBankApp {

    public static void main(String[] args) {
        MemberService ms =
                new WJMemberService(new MemberListDao());

        AccountService as =
                new WJAccountService(new AccountListDao());

        new AdminMenu(as, ms).run();
        new BankingMenu(as, ms).run();
        new ManageAccountsMenu(as, ms).run();
        new ManageMembersMenu(as, ms).run();
        new MyInfoMenu(as, ms).run();
        new StartMenu(as, ms).run();
    }
}
