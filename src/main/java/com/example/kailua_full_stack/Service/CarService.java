package com.example.kailua_full_stack.Service;

import com.example.kailua_full_stack.Model.Car;
import com.example.kailua_full_stack.Repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepo carRepo;

    public List<Car> get_All_Car() throws SQLException {
        return carRepo.get_All_Car();
    }

    public void createCar(Car c) throws SQLException {
        carRepo.createCar(c);
    }

    public Car get_Car_by_id(String regNb) throws SQLException {
        return carRepo.get_Car_by_id(regNb);
    }
    public boolean deleteCar(String regNb) throws SQLException {
        return carRepo.deleteCar(regNb);
    }

    public void updateCar(Car c) throws SQLException {
        carRepo.updateCar(c);
    }


}
