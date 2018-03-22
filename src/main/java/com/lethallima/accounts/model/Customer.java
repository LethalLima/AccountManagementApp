package com.lethallima.accounts.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

@Entity
public class Customer {
    private int customerId;
    private String customerName;
    private String serviceMon;
    private String serviceTues;
    private String serviceWed;
    private String serviceThu;
    private String serviceFri;
    private String serviceSat;
    private String serviceSun;
    private int createdBy;
    private Timestamp createdAt;
    private int updatedBy;
    private Timestamp updatedAt;
    private Set<CustomerContact> contacts;

    @Id
    @Column(name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Column(name = "customer_name")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "service_mon")
    public String getServiceMon() {
        return serviceMon;
    }

    public void setServiceMon(String serviceMon) {
        this.serviceMon = serviceMon;
    }

    @Basic
    @Column(name = "service_tues")
    public String getServiceTues() {
        return serviceTues;
    }

    public void setServiceTues(String serviceTues) {
        this.serviceTues = serviceTues;
    }

    @Basic
    @Column(name = "service_wed")
    public String getServiceWed() {
        return serviceWed;
    }

    public void setServiceWed(String serviceWed) {
        this.serviceWed = serviceWed;
    }

    @Basic
    @Column(name = "service_thu")
    public String getServiceThu() {
        return serviceThu;
    }

    public void setServiceThu(String serviceThu) {
        this.serviceThu = serviceThu;
    }

    @Basic
    @Column(name = "service_fri")
    public String getServiceFri() {
        return serviceFri;
    }

    public void setServiceFri(String serviceFri) {
        this.serviceFri = serviceFri;
    }

    @Basic
    @Column(name = "service_sat")
    public String getServiceSat() {
        return serviceSat;
    }

    public void setServiceSat(String serviceSat) {
        this.serviceSat = serviceSat;
    }

    @Basic
    @Column(name = "service_sun")
    public String getServiceSun() {
        return serviceSun;
    }

    public void setServiceSun(String serviceSun) {
        this.serviceSun = serviceSun;
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
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_by")
    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="customer_id")
    public Set<CustomerContact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<CustomerContact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId &&
                createdBy == customer.createdBy &&
                updatedBy == customer.updatedBy &&
                Objects.equals(customerName, customer.customerName) &&
                Objects.equals(serviceMon, customer.serviceMon) &&
                Objects.equals(serviceTues, customer.serviceTues) &&
                Objects.equals(serviceWed, customer.serviceWed) &&
                Objects.equals(serviceThu, customer.serviceThu) &&
                Objects.equals(serviceFri, customer.serviceFri) &&
                Objects.equals(serviceSat, customer.serviceSat) &&
                Objects.equals(serviceSun, customer.serviceSun) &&
                Objects.equals(createdAt, customer.createdAt) &&
                Objects.equals(updatedAt, customer.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, serviceMon, serviceTues, serviceWed, serviceThu, serviceFri, serviceSat, serviceSun, createdBy, createdAt, updatedBy, updatedAt);
    }
}
