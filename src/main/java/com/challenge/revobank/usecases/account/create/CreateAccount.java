package com.challenge.revobank.usecases.account.create;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateAccount {

  private final CreateAccountRepository accountRepository;

  @Autowired
  public CreateAccount(CreateAccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  public AccountEntity store(AccountEntity entity) {
    return accountRepository.save(entity);
  }
}
