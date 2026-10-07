package bank.account;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import bank.member.Member;

public class AccountListDao implements AccountDao {
	List<Account> AccountDB = new LinkedList<>();
	
	@Override
	public boolean save(Account a) {
		return AccountDB.add(a);
	}

	@Override
	public List<Account> findAll() {
		if (AccountDB.size() == 0) { 
			return null; //멤버가 없으면 null
		}
		
		List<Account> Account = new ArrayList<>();
		for (Account a : AccountDB) {
			Account.add(a);
		}
		return Account;
	}
	

	@Override
	public Account findByAccountNo(int accountNo) {
		for (Account a : AccountDB) {
			if(a.getAccountNo() == (accountNo)) {
				return a;
			}
		}
		return null;
	}

	
	
	
	
	@Override
	public List<Account> findByMemberId(String memberId) {
		List<Account> AccountList = new ArrayList<>();
		for (Account a : AccountDB) {
			if(a.getMemberId().equals(memberId)) {
				AccountList.add(a);
			}
		}
		return AccountList;
	}

		
	@Override
	public boolean update(Account a) {
		Account target = findByAccountNo(a.getAccountNo());
		if (target == null){
			return false;
		}
		AccountDB.remove(target);
		AccountDB.add(a);
		return true;
	}

	@Override
	public boolean delete(Account a) {
		Account target = findByAccountNo(a.getAccountNo());
		if (target == null){
			return false;
		}
		return AccountDB.remove(target);
	}
}
