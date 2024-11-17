package com.example.kailua_full_stack.Repository;

import com.example.kailua_full_stack.Model.Car;
import com.example.kailua_full_stack.Model.Contracts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class CarRepo {
    @Autowired
    JdbcTemplate template;

    public List<Car> get_All_Car() throws SQLException {
        String sql = "SELECT * FROM car";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);
        return template.query(sql, rowMapper);
    }
    public Car get_Car_by_id(String regNb) throws SQLException {
        String sql = "SELECT * FROM car WHERE regNb = ?";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);
        Car car = template.queryForObject(sql, rowMapper, regNb);
        return car;
    }

    public void createCar(Car c) throws SQLException {
        String sql = "INSERT INTO car (regNb, car_Id, brand, model, firstRegistrationDate, odometer, description_of_the_car) values (?,?,?,?,?,?,?)";
        template.update(sql, String.valueOf(c.getRegNB()), c.getCar_Id(), c.getBrand(), c.getModel(), c.getFirstRegistrationDate(), c.getOdometer(), c.getDescription_of_the_car());
    }

    public void updateCar(Car c) throws SQLException {
        String sql = "UPDATE car SET brand=?, model=?, firstRegistrationDate=?, odometer=?, description_of_the_car=? WHERE regNb= ?";
        template.update(sql, c.getBrand(), c.getModel(), c.getFirstRegistrationDate(), c.getOdometer(), c.getDescription_of_the_car(), String.valueOf(c.getRegNB()));
    }
    public Boolean deleteCar (String regNb) throws SQLException {
        String sql = "DELETE FROM car WHERE regNb = ?";
        return template.update(sql, regNb)>0;
    }

}
