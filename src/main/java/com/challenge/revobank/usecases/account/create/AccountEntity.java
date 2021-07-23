package com.challenge.revobank.usecases.account.create;

import com.challenge.revobank.jobsroles.JobsRoles;
import com.challenge.revobank.statusaccount.StatusAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "account")
@Data
public class AccountEntity {

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private UUID id;

  @JsonProperty(required = true)
  @NotNull(message = "Name Required")
  private String name;

  @JsonProperty
  private String document;

  @JsonProperty
  @Column(name = "birth_date")
  private Date birthDate;

  @JsonProperty
  private Integer account;

  @JsonProperty
  private Character accountDigit;

  @JsonProperty
  @Column(name = "job_title")
  private JobsRoles jobTitle;

  @JsonProperty
  private StatusAccount status;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_at")
  private Date createdAt;

  @UpdateTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "updated_at")
  private Date updatedAt;

}
