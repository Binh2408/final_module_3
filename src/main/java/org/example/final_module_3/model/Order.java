package org.example.final_module_3.model;

import java.time.LocalDate;

public class Order {
    private int idOrder;
    private String payment;
    private LocalDate dateSelect;
    private LocalDate dateShip;
    private String address;
    private int idCustomer;
    private int idEmployee;

    public Order() {
    }

    public Order(int idOrder, String payment, LocalDate dateSelect, LocalDate dateShip, String address, int idCustomer, int idEmployee) {
        this.idOrder = idOrder;
        this.payment = payment;
        this.dateSelect = dateSelect;
        this.dateShip = dateShip;
        this.address = address;
        this.idCustomer = idCustomer;
        this.idEmployee = idEmployee;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public LocalDate getDateSelect() {
        return dateSelect;
    }

    public void setDateSelect(LocalDate dateSelect) {
        this.dateSelect = dateSelect;
    }

    public LocalDate getDateShip() {
        return dateShip;
    }

    public void setDateShip(LocalDate dateShip) {
        this.dateShip = dateShip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }
}
