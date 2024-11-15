package com.example.kailua_full_stack.Repository;

import com.example.kailua_full_stack.Model.Contracts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class ContractsRepo {
    @Autowired
    JdbcTemplate template;

    public List<Contracts> get_All_Contracts() throws SQLException {
        String sql = "SELECT * FROM contracts";
        RowMapper<Contracts> rowMapper = new BeanPropertyRowMapper<>(Contracts.class);
        return template.query(sql, rowMapper);
    }
    public Contracts get_Contracts_by_id(int id) throws SQLException {
        String sql = "SELECT * FROM contracts WHERE id = ?";
        RowMapper<Contracts> rowMapper = new BeanPropertyRowMapper<>(Contracts.class);
        Contracts contracts = template.queryForObject(sql, rowMapper, id);
        return contracts;
    }

    public void createContracts(Contracts c) throws SQLException {
        String sql = "INSERT INTO contracts (contract_number, customer_Id, regNb, rental_start_date, rental_end_date, maxKm) values (?,?,?,?,?,?)";
        template.update(sql, c.getContract_number(), c.getCustomer_Id(), c.getRegNb(), c.getRental_start_date(), c.getRental_end_date(), c.getMaxKm());
    }
    public void updateContracts(Contracts c) throws SQLException {
        String sql = "UPDATE contracts SET contract_number=?, customer_Id=?, regNb=?, rental_start_date=?, rental_end_date=?, maxKm=? WHERE id = ?";
        template.update(sql, c.getContract_number(), c.getCustomer_Id(),c.getRegNb(), c.getRental_start_date(), c.getRental_end_date(), c.getMaxKm());
    }

    public Boolean deleteContracts(int contract_number) throws SQLException {
        String sql = "DELETE FROM contracts WHERE contract_number = ?";
        return template.update(sql, contract_number)>0;
    }


}
