package com.beauty.webApp.service;

import com.beauty.webApp.model.Manager;

import java.util.List;

public interface ManagerService {
    List<Manager> getAllManagers();

    Manager getManagerById(Long id);

    Manager createManger(Manager manager);

    void deleteManagerById(Long id);
}
