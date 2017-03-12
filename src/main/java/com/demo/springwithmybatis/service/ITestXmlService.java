package com.demo.springwithmybatis.service;

import com.demo.springwithmybatis.model.Account;

import java.util.List;

public interface ITestXmlService {

	
	public int insertAccount(Account account) throws Exception;

	public Account findAccountById(int i);
	
	public List<Account> findAccountsById(int i);
}
