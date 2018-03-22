package com.lethallima.accounts.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "customer_contact", schema = "athens_database")
public class CustomerContact {
    private int customerContactId;
    private int customerId;
    private String contactPerson;
    private String contactInfo;
    private String email;
    private Byte emailSent;
    private int createdBy;
    private Timestamp createdDate;
    private Integer updatedBy;
    private Timestamp updatedDate;

    @Id
    @Column(name = "customer_contact_id")
    public int getCustomerContactId() {
        return customerContactId;
    }

    public void setCustomerContactId(int customerContactId) {
        this.customerContactId = customerContactId;
    }

    @Basic
    @Column(name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "contact_person")
    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Basic
    @Column(name = "contact_info")
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "email_sent")
    public Byte getEmailSent() {
        return emailSent;
    }

    public void setEmailSent(Byte emailSent) {
        this.emailSent = emailSent;
    }

    @Basic
    @Column(name = "created_by")
    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "updated_by")
    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Basic
    @Column(name = "updated_date")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerContact that = (CustomerContact) o;
        return customerContactId == that.customerContactId &&
                customerId == that.customerId &&
                createdBy == that.createdBy &&
                Objects.equals(contactPerson, that.contactPerson) &&
                Objects.equals(contactInfo, that.contactInfo) &&
                Objects.equals(email, that.email) &&
                Objects.equals(emailSent, that.emailSent) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedBy, that.updatedBy) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerContactId, customerId, contactPerson, contactInfo, email, emailSent, createdBy, createdDate, updatedBy, updatedDate);
    }
}
