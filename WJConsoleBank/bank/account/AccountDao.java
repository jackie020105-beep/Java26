package bank.account;

import java.util.List;
import java.util.ArrayList;

public interface AccountDao {
	boolean save(Account a);
	List<Account> findAll();
	Account findByAccountNo(int accountNo);
	List<Account> findByMemberId(String memberId);
	boolean update(Account a);
	boolean delete(Account a);
}
