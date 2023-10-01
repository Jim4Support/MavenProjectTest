package com.beauty.webApp.service;

import com.beauty.webApp.model.Sales;

public interface SaleService {

    Sales createSale(Long carId, Long managerId, int quantity);
}
