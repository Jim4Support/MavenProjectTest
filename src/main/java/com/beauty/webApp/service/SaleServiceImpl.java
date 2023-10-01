package com.beauty.webApp.service;

import com.beauty.webApp.model.CarForSales;
import com.beauty.webApp.model.Manager;
import com.beauty.webApp.model.Sales;
import com.beauty.webApp.repository.SaleRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService{

    private final CarService carService;
    private final ManagerService managerService;
    private final SaleRepository saleRepository;

    public SaleServiceImpl(CarService carService, ManagerService managerService, SaleRepository saleRepository) {
        this.carService = carService;
        this.managerService = managerService;
        this.saleRepository = saleRepository;
    }

    @Override
    @Transactional
    public Sales createSale(Long carId, Long managerId, int quantity) {
        CarForSales car = carService.getCarById(carId);
        Manager manager = managerService.getManagerById(managerId);
        Sales sale = new Sales();

        if (quantity < car.getQuantity()) {
            car.setQuantity(car.getQuantity() - quantity);
            manager.setSales(manager.getSales() + quantity);

            carService.createCar(car);
            managerService.createManger(manager);
        }
        sale.setCar(car);
        sale.setManager(manager);
        sale.setQuantity(quantity);

        return saleRepository.save(sale);
    }
}
