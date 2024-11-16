package com.example.kailua_full_stack.Repository;

import com.example.kailua_full_stack.Model.Contracts;
import com.example.kailua_full_stack.Model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class CustomersRepo {
    @Autowired
    JdbcTemplate template;

    public List<Customers> get_All_Customers() throws SQLException {
        String sql = "SELECT * FROM customers";
        RowMapper<Customers> rowMapper = new BeanPropertyRowMapper<>(Customers.class);
        return template.query(sql, rowMapper);
    }

    public Customers get_Customers_by_id(int customer_Id) throws SQLException {
        String sql = "SELECT * FROM customers WHERE customer_Id = ?";
        RowMapper<Customers> rowMapper = new BeanPropertyRowMapper<>(Customers.class);
        Customers customers = template.queryForObject(sql, rowMapper, customer_Id);
        return customers;
    }

    public void makeCustomers(Customers c) throws SQLException {
        String sql = "INSERT INTO customers (customer_Id, customer_name, customer_address, zip_code, city, country, mobi_nr, email, driversLicence_Nb, driver_since) values (?,?,?,?,?,?,?,?,?,?)";
        template.update(sql, c.getCustomer_Id(),c.getCustomer_name(),c.getCustomer_address(),c.getZip_code(),c.getCity(), c.getCountry(),c.getMobil_nr(),c.getEmail(),c.getDriversLicence_Nb(),c.getDriver_since());
    }
    public void updateCustomers(Customers c) throws SQLException {
        String sql = "UPDATE contracts SET customer_name=?, customer_address=?, zip_code=?, city=?, country=?, mobil_nr=?, email=?, driversLicence_Nb=?, driver_since=? WHERE customer_Id = ?";
        template.update(sql, c.getCustomer_name(),c.getCustomer_address(),c.getZip_code(),c.getCity(),c.getCountry(),c.getMobil_nr(),c.getEmail(),c.getDriversLicence_Nb(),c.getDriver_since());
    }

    public Boolean deleteCustomers(int customer_Id) throws SQLException {
        String sql = "DELETE FROM customers WHERE customer_Id = ?";
        return template.update(sql, customer_Id)>0;
    }


}
