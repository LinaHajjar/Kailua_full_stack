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
    public String index(Model model) throws SQLException {
        model.addAttribute("contracts", contractsService.get_All_Contracts());
        return "home/index";
    }

    @GetMapping("/create")
    public String create(){
        return "home/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Contracts c) throws SQLException {
        contractsService.createContracts(c);
        return "redirect:/";
    }

    @GetMapping("/get_All_Contracts/{contract_number}")
    public String get_All_Contracts(@PathVariable("contract_number") int contract_number, Model model)throws SQLException{
        model.addAttribute("contracts", contractsService.get_Contracts_by_id(contract_number));
        return "home/viewContracts";
    }

    @GetMapping("/deleteContracts/{contract_number}")
    public String deleteContracts(@PathVariable("contract_number") int contract_number)throws SQLException {
        boolean deleted = contractsService.deleteContracts(contract_number);
        return "redirect:/";
    }

    @GetMapping("/updateContracts/{contract_number}")
    public String updateAlbum(@PathVariable("contract_number") int contract_number, Model model)throws SQLException {
        model.addAttribute("album", contractsService.get_Contracts_by_id(contract_number));
        return "home/updateContracts";
    }

    @PostMapping("/updateContracts")
    public String update(@ModelAttribute Contracts c) throws SQLException {
        contractsService.updateContracts(c);
        return "redirect:/";
    }
}
