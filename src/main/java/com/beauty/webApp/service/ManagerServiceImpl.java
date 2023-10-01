package com.beauty.webApp.service;

import com.beauty.webApp.model.Manager;
import com.beauty.webApp.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerServiceImpl implements ManagerService{

    public final ManagerRepository managerRepository;

    @Autowired
    public ManagerServiceImpl(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @Override
    public List<Manager> getAllManagers() {
        return managerRepository.findAll();
    }

    @Override
    public Manager getManagerById(Long id) {
        Optional<Manager> optionalManager = managerRepository.findById(id);
        if (optionalManager.isEmpty()) {
            throw new IllegalStateException("Manager with id " + id + "doesn't exist");
        }
        return optionalManager.get();
    }

    @Override
    public Manager createManger(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public void deleteManagerById(Long id) {
        managerRepository.deleteById(id);
    }
}
