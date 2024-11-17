package com.example.kailua_full_stack.Controller;

import com.example.kailua_full_stack.Model.Car;
import com.example.kailua_full_stack.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/homeCar/indexCar")
    public String indexCar(Model model) throws SQLException {
        model.addAttribute("car", carService.get_All_Car());
        return "homeCar/indexCar";
    }

    @GetMapping("/createCar")
    public String createCar(){
        return "homeCar/createCar";
    }

    @PostMapping("/createCar")
    public String createCar(@ModelAttribute Car c) throws SQLException {
        carService.createCar(c);
        return "redirect:/";
    }

    @GetMapping("/viewCar/{regNb}")
    public String viewCar(@PathVariable("regNb") String regNb, Model model)throws SQLException{
        model.addAttribute("car", carService.get_Car_by_id(regNb));
        return "homeCar/viewCar";
    }


    @GetMapping("/deleteCar/{regNb}")
    public String deleteCar(@PathVariable("regNb") String regNb)throws SQLException {
        boolean deleted = carService.deleteCar(regNb);
        return "redirect:/";
    }

    @GetMapping("/updateCar/{regNb}")
    public String updateCar(@PathVariable("regNb") String regNb, Model model)throws SQLException {
        model.addAttribute("c", carService.get_Car_by_id(regNb));
        return "homeCar/updateCar";
    }

    @PostMapping("/updateCar")
    public String updateCar(@ModelAttribute Car c) throws SQLException {
        carService.updateCar(c);
        return "redirect:/";
    }
}