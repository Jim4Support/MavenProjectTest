package com.beauty.webApp.controller;

import com.beauty.webApp.model.CarForSales;
import com.beauty.webApp.model.Manager;
import com.beauty.webApp.service.ManagerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    private final ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping("/all")
    public List<Manager> getAllManagers() {
        return managerService.getAllManagers();
    }

    @PostMapping("/create")
    public Manager createManager(@RequestBody Manager manager) {
        return managerService.createManger(manager);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteManagerById(@PathVariable("id") Long id) {
        managerService.deleteManagerById(id);
    }
}
