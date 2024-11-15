package com.example.kailua_full_stack.Controller;

import com.example.kailua_full_stack.Model.Contracts;
import com.example.kailua_full_stack.Service.ContractsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

import static org.apache.coyote.http11.Constants.a;

@Controller
public class ContractsController {

    @Autowired
    ContractsService contractsService;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/home/indexContracts")
    public String indexContracts(Model model) throws SQLException {
        model.addAttribute("contracts", contractsService.get_All_Contracts());
        return "home/indexContracts";
    }

    /*@GetMapping("/")
    public String indexContracts(Model model) throws SQLException {
        model.addAttribute("contracts", contractsService.get_All_Contracts());
        return "home/indexContracts";
    }*/

    @GetMapping("/create")
    public String create(){
        return "home/createContracts";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Contracts c) throws SQLException {
        contractsService.createContracts(c);
        return "redirect:/";
    }

    @GetMapping("/viewContracts/{contract_number}")
    public String viewContracts(@PathVariable("contract_number") int contract_number, Model model)throws SQLException{
        model.addAttribute("contracts", contractsService.get_Contracts_by_id(contract_number));
        return "home/viewContracts";
    }

    @GetMapping("/deleteContracts/{contract_number}")
    public String deleteContracts(@PathVariable("contract_number") int contract_number)throws SQLException {
        boolean deleted = contractsService.deleteContracts(contract_number);
        return "redirect:/";
    }

    @GetMapping("/updateContracts/{contract_number}")
    public String updateContracts(@PathVariable("contract_number") int contract_number, Model model)throws SQLException {
        model.addAttribute("c", contractsService.get_Contracts_by_id(contract_number));
        return "home/updateContracts";
    }

    @PostMapping("/updateContracts")
    public String update(@ModelAttribute Contracts c) throws SQLException {
        contractsService.updateContracts(c);
        return "redirect:/";
    }
}
