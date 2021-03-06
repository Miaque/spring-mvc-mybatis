package com.demo.springwithmybatis.service.impl;

import com.demo.springwithmybatis.dao.ITestXmlDAO;
import com.demo.springwithmybatis.model.Account;
import com.demo.springwithmybatis.service.ITestXmlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("testXmlService")
public class TestXmlServiceImpl implements ITestXmlService {

	Logger logger = LoggerFactory.getLogger(TestXmlServiceImpl.class);

	@Resource
	private ITestXmlDAO testXmlDAO;
	public void test() {
	}

	public int insertAccount(Account account){
		return this.testXmlDAO.insertAccount(account);
	}

	public Account findAccountById(int i) {
		
		return this.testXmlDAO.getAccountById(i);
	}

	public List<Account> findAccountsById(int i) {
		List<Account> accounts = this.testXmlDAO.findAccountsById(i);
		return accounts;
	}

}
