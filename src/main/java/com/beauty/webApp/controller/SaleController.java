package com.beauty.webApp.controller;

import com.beauty.webApp.model.Sales;
import com.beauty.webApp.service.SaleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sale")
public class SaleController {

    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping("/create/{carId}/{managerId}/{quantity}")
    public Sales createSale(
            @PathVariable("carId") Long carId,
            @PathVariable("managerId") Long managerId,
            @PathVariable("quantity") int quantity){
        return saleService.createSale(carId, managerId, quantity);
    }
}
