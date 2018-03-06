package com.lethallima.accounts.service;

import com.lethallima.accounts.model.Account;
import com.lethallima.accounts.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Transactional(readOnly = true)
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAccounts() {
        return (List<Account>) accountRepository.findAll();
    }

    @Override
    public Account getAccount(String accountNumber) {
        return accountRepository.findOne(accountNumber);
    }

    @Override
    public Account updateAccount(Account account) throws UserPrincipalNotFoundException {
        Account toBeUpdatedAccount = accountRepository.findOne(account.getAccountNumber());

        if (toBeUpdatedAccount != null) {
            if(!toBeUpdatedAccount.equals(account)) {
                toBeUpdatedAccount.setAddress(account.getAddress());

                return accountRepository.save(toBeUpdatedAccount);
            } else {
                throw new UserPrincipalNotFoundException(account.getAccountNumber() + " has no changes to update.");
            }
        } else {
            throw new UserPrincipalNotFoundException(account.getAccountNumber());
        }

    }
}
