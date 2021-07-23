package com.challenge.revobank.usecases.account.create;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CreateAccountRepository extends JpaRepository<AccountEntity, UUID> {
}
