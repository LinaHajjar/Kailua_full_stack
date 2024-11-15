package com.example.kailua_full_stack.Model;

import java.time.LocalDate;

public class Contracts {
    int contract_number;
    int customer_Id;
    String regNb;
    LocalDate rental_start_date;
    LocalDate rental_end_date;
    int maxKm;

    public Contracts() {}
    public Contracts(int contract_number, int customer_Id, LocalDate rental_start_date, String regNb, LocalDate rental_end_date, int maxKm) {
        this.contract_number = contract_number;
        this.customer_Id = customer_Id;
        this.rental_start_date = rental_start_date;
        this.regNb = regNb;
        this.rental_end_date = rental_end_date;
        this.maxKm = maxKm;
    }

    public int getContract_number() {
        return contract_number;
    }

    public void setContract_number(int contract_number) {
        this.contract_number = contract_number;
    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public String getRegNb() {
        return regNb;
    }

    public void setRegNb(String regNb) {
        this.regNb = regNb;
    }

    public LocalDate getRental_start_date() {
        return rental_start_date;
    }

    public void setRental_start_date(LocalDate rental_start_date) {
        this.rental_start_date = rental_start_date;
    }

    public LocalDate getRental_end_date() {
        return rental_end_date;
    }

    public void setRental_end_date(LocalDate rental_end_date) {
        this.rental_end_date = rental_end_date;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }
}
