package com.lethallima.accounts.controller;

import com.lethallima.accounts.model.Account;
import com.lethallima.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping(value = "/account")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @RequestMapping(value = "/{accountNumber}", method = RequestMethod.GET)
    public String getAccount(@PathVariable("accountNumber") String accountNumber, Model model) {
        model.addAttribute("account", accountService.getAccount(accountNumber));
        return "account/edit-account";
    }
}
