package com.example.kailua_full_stack.Service;

import com.example.kailua_full_stack.Model.Contracts;
import com.example.kailua_full_stack.Model.Customers;
import com.example.kailua_full_stack.Repository.ContractsRepo;
import com.example.kailua_full_stack.Repository.CustomersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CustomersService {

    @Autowired
    CustomersRepo customersRepo;

    public List<Customers> get_All_Customers() throws SQLException {
        return customersRepo.get_All_Customers();
    }

    public void makeCustomers(Customers c) throws SQLException {
        customersRepo.makeCustomers(c);
    }

    public Customers get_Customers_by_id(int customer_Id) throws SQLException {
        return customersRepo.get_Customers_by_id(customer_Id);
    }

    public boolean deleteCustomers(int customer_Id) throws SQLException {
        return customersRepo.deleteCustomers(customer_Id);
    }

    public void updateCustomers(Customers c) throws SQLException {
        customersRepo.updateCustomers(c);
    }


}
