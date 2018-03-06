package com.lethallima.accounts.model;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Account {
    private String accountNumber;
    private String address;
    private String binNotes;
    private Timestamp attemptOneDate;
    private Timestamp attemptTwoDate;
    private Timestamp attemptThreeDate;
    private String notes;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "account_number")
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "bin_notes")
    public String getBinNotes() {
        return binNotes;
    }

    public void setBinNotes(String binNotes) {
        this.binNotes = binNotes;
    }

    @Basic
    @Column(name = "attempt_one_date")
    public Timestamp getAttemptOneDate() {
        return attemptOneDate;
    }

    public void setAttemptOneDate(Timestamp attemptOneDate) {
        this.attemptOneDate = attemptOneDate;
    }

    @Basic
    @Column(name = "attempt_two_date")
    public Timestamp getAttemptTwoDate() {
        return attemptTwoDate;
    }

    public void setAttemptTwoDate(Timestamp attemptTwoDate) {
        this.attemptTwoDate = attemptTwoDate;
    }

    @Basic
    @Column(name = "attempt_three_date")
    public Timestamp getAttemptThreeDate() {
        return attemptThreeDate;
    }

    public void setAttemptThreeDate(Timestamp attemptThreeDate) {
        this.attemptThreeDate = attemptThreeDate;
    }

    @Basic
    @Column(name = "notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) &&
                Objects.equals(address, account.address) &&
                Objects.equals(binNotes, account.binNotes) &&
                Objects.equals(attemptOneDate, account.attemptOneDate) &&
                Objects.equals(attemptTwoDate, account.attemptTwoDate) &&
                Objects.equals(attemptThreeDate, account.attemptThreeDate) &&
                Objects.equals(notes, account.notes) &&
                Objects.equals(createdAt, account.createdAt) &&
                Objects.equals(updatedAt, account.updatedAt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(accountNumber, address, binNotes, attemptOneDate, attemptTwoDate, attemptThreeDate, notes, createdAt, updatedAt);
    }
}
