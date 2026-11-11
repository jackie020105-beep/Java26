package bank.account;

import java.util.List;

import bank.account.Account;


public interface AccountDao {
	boolean save(Account a);
	List<Account> findAll();
	Account findById(String id);
	boolean update(Account a);
	boolean delete(Account a);
}
