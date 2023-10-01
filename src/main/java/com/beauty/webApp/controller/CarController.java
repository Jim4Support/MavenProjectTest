package com.beauty.webApp.controller;

import com.beauty.webApp.model.CarForSales;
import com.beauty.webApp.service.CarService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public CarForSales createCar(@RequestBody CarForSales car) {
        return carService.createCar(car);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCarById(@PathVariable("id") Long id) {
        carService.deleteCarById(id);
    }
}
