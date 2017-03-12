package com.demo.springwithmybatis.service;

import java.util.List;

import com.demo.springwithmybatis.model.Account;

public interface ITestService {

	
	public void test();
	
	public boolean transfer(float money, int from, int to) throws Exception;
	
	public int insertAccount(Account account) throws Exception;

	public Account findAccountById(int i);
	
	public List<Account> findAccountsById(int i);
}
