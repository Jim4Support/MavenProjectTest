package com.beauty.webApp.service;

import com.beauty.webApp.model.CarForSales;
import com.beauty.webApp.model.Manager;
import com.beauty.webApp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<CarForSales> optionalCarForSales = carRepository.findById(id);
        if (optionalCarForSales.isEmpty()) {
            throw new IllegalStateException("Car with id " + id + "doesn't exist");
        }
        return optionalCarForSales.get();
    }

    @Override
    public CarForSales createCar(CarForSales car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }
}
