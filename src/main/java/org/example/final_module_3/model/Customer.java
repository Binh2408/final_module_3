package org.example.final_module_3.model;

import java.time.LocalDate;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private LocalDate dateOfBirthCustomer;
    private String telephoneCustomer;
    private String addressCustomer;
    private String emailCustomer;

    public Customer() {
    }

    public Customer(int idCustomer, String nameCustomer, LocalDate dateOfBirthCustomer, String telephoneCustomer, String addressCustomer, String emailCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dateOfBirthCustomer = dateOfBirthCustomer;
        this.telephoneCustomer = telephoneCustomer;
        this.addressCustomer = addressCustomer;
        this.emailCustomer = emailCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public LocalDate getDateOfBirthCustomer() {
        return dateOfBirthCustomer;
    }

    public void setDateOfBirthCustomer(LocalDate dateOfBirthCustomer) {
        this.dateOfBirthCustomer = dateOfBirthCustomer;
    }

    public String getTelephoneCustomer() {
        return telephoneCustomer;
    }

    public void setTelephoneCustomer(String telephoneCustomer) {
        this.telephoneCustomer = telephoneCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }
}
