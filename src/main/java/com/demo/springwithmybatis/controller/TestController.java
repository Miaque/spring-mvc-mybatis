package com.demo.springwithmybatis.controller;

import com.demo.springwithmybatis.model.Account;
import com.demo.springwithmybatis.service.ITestService;
import com.demo.springwithmybatis.service.ITestXmlService;
import com.demo.springwithmybatis.utils.HttpServletUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {
    private Logger logger = Logger.getLogger(TestController.class);
    @Autowired
    private ITestService testService;

    @Autowired
    private ITestXmlService testXmlService;

    @RequestMapping("/test")
    public void test(HttpServletRequest request, HttpServletResponse response) {
        List<Account> accountList = this.testService.findAccountsById(3);

        logger.info(accountList);
        HttpServletUtils.responseAccessData(response,accountList);
    }
    @RequestMapping("/testXml")
    public void testXml(HttpServletRequest request, HttpServletResponse response) {
        List<Account> accountList = this.testXmlService.findAccountsById(3);
        logger.info(accountList);
        HttpServletUtils.responseAccessData(response,accountList);
    }
}
