package com.lethallima.accounts.service;

import com.lethallima.accounts.model.Account;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

public interface AccountService {
    List<Account> getAccounts();

    Account getAccount(String accountNumber);

    Account updateAccount(Account account) throws UserPrincipalNotFoundException;
}
