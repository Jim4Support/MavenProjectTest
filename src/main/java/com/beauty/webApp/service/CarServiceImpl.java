package com.beauty.webApp.service;

import com.beauty.webApp.model.CarForSales;
import com.beauty.webApp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<CarForSales> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public CarForSales getCarById(Long id) {
        return null;
    }

    @Override
    public CarForSales createCar(CarForSales car) {
        return null;
    }

    @Override
    public void deleteCarById(Long id) {

    }
}
