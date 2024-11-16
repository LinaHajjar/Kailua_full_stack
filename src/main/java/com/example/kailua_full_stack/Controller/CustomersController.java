package com.example.kailua_full_stack.Controller;

import com.example.kailua_full_stack.Model.Contracts;
import com.example.kailua_full_stack.Model.Customers;
import com.example.kailua_full_stack.Service.ContractsService;
import com.example.kailua_full_stack.Service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
public class CustomersController {

    @Autowired
    CustomersService customersService;


    @GetMapping("/homeCustomers/indexCustomers")
    public String indexCustomers(Model model) throws SQLException {
        model.addAttribute("customers", customersService.get_All_Customers());
        return "homeCustomers/indexCustomers";
    }


    @GetMapping("/make")
    public String make(){
        return "homeCustomers/createCustomers";
    }

    @PostMapping("/make")
    public String make(@ModelAttribute Customers c) throws SQLException {
        customersService.makeCustomers(c);
        return "redirect:/";
    }

    @GetMapping("/viewCustomers/{customer_Id}")
    public String viewCustomers(@PathVariable("customer_Id") int customer_Id, Model model)throws SQLException{
        model.addAttribute("customers", customersService.get_Customers_by_id(customer_Id));
        return "homeCustomers/viewCustomers";
    }

    @GetMapping("/deleteCustomers/{customer_Id}")
    public String deleteCustomers(@PathVariable("customer_Id") int customer_Id)throws SQLException {
        boolean deleted = customersService.deleteCustomers(customer_Id);
        return "redirect:/";
    }

    @GetMapping("/updateCustomers/{customer_Id}")
    public String updateCustomers(@PathVariable("customer_Id") int customer_Id, Model model)throws SQLException {
        model.addAttribute("c", customersService.get_Customers_by_id(customer_Id));
        return "homeCustomers/updateCustomers";
    }

    @PostMapping("/updateCustomers")
    public String update(@ModelAttribute Customers c) throws SQLException {
        customersService.updateCustomers(c);
        return "redirect:/";
    }

}
