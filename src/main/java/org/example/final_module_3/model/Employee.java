package org.example.final_module_3.model;

import java.time.LocalDate;

public class Employee {
    private int idEmployee;
    private String nameEmployee;
    private LocalDate dateOfBirthEmployee;
    private String addressEmployee;

    public Employee() {
    }

    public Employee(int idEmployee, String nameEmployee, LocalDate dateOfBirthEmployee, String addressEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.addressEmployee = addressEmployee;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public LocalDate getDateOfBirthEmployee() {
        return dateOfBirthEmployee;
    }

    public void setDateOfBirthEmployee(LocalDate dateOfBirthEmployee) {
        this.dateOfBirthEmployee = dateOfBirthEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }
}
