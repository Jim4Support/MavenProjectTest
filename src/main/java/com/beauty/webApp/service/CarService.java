package com.beauty.webApp.service;

import com.beauty.webApp.model.CarForSales;

import java.util.List;

public interface CarService {
    List<CarForSales> getAllCars();

    CarForSales getCarById(Long id);

    CarForSales createCar(CarForSales car);

    void deleteCarById(Long id);
}
