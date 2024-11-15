package com.example.kailua_full_stack.Model;

import java.time.LocalDate;

public class Customers {
    int customer_Id;
    String customer_name;
    String customer_address;
    int zip_code;
    String city;
    String country;
    String mobil_nr;
    String email;
    String driversLicence_Nb;
    LocalDate driver_since;

    public Customers() {}
    public Customers(int customer_Id, String customer_name, String customer_address, int zip_code, String city, String country, String mobil_nr, String email, String driversLicence_Nb, LocalDate driver_since) {
        this.customer_Id = customer_Id;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.zip_code = zip_code;
        this.city = city;
        this.country = country;
        this.mobil_nr = mobil_nr;
        this.email = email;
        this.driversLicence_Nb = driversLicence_Nb;
        this.driver_since = driver_since;
    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobil_nr() {
        return mobil_nr;
    }

    public void setMobil_nr(String mobil_nr) {
        this.mobil_nr = mobil_nr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDriversLicence_Nb() {
        return driversLicence_Nb;
    }

    public void setDriversLicence_Nb(String driversLicence_Nb) {
        this.driversLicence_Nb = driversLicence_Nb;
    }

    public LocalDate getDriver_since() {
        return driver_since;
    }

    public void setDriver_since(LocalDate driver_since) {
        this.driver_since = driver_since;
    }
}
