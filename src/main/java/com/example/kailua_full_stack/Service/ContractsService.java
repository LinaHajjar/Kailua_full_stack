package com.example.kailua_full_stack.Service;

import com.example.kailua_full_stack.Model.Contracts;
import com.example.kailua_full_stack.Model.Customers;
import com.example.kailua_full_stack.Repository.ContractsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ContractsService {

    @Autowired
    ContractsRepo contractsRepo;

    public List<Contracts> get_All_Contracts() throws SQLException {
        return contractsRepo.get_All_Contracts();
    }

    public void createContracts(Contracts c) throws SQLException {
        contractsRepo.createContracts(c);
    }

    public Contracts get_Contracts_by_id(int contract_number) throws SQLException {
        return contractsRepo.get_Contracts_by_id(contract_number);
    }
    public boolean deleteContracts(int contract_number) throws SQLException {
        return contractsRepo.deleteContracts(contract_number);
    }

    public void updateContracts(Contracts c) throws SQLException {
        contractsRepo.updateContracts(c);
    }


}
