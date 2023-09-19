package com.beauty.webApp.repository;

import com.beauty.webApp.model.CarForSales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarForSales, Long> {
}
