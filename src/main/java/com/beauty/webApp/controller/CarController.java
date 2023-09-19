package com.beauty.webApp.controller;

import com.beauty.webApp.model.CarForSales;
import com.beauty.webApp.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public List<CarForSales> getAllCars() {
        return carService.getAllCars();
    }
}
