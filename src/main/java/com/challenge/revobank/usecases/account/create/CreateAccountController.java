package com.challenge.revobank.usecases.account.create;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/account")
public class CreateAccountController {

  private final CreateAccount createAccount;

  @Autowired
  public CreateAccountController(CreateAccount createAccount) {
    this.createAccount = createAccount;
  }

  @PostMapping
  public ResponseEntity<AccountEntity> createAccount(@Valid @RequestBody AccountEntity accountEntity) {
    return ResponseEntity.ok(createAccount.store(accountEntity));
  }


}
