package com.Dishproject.Dishtask.repository;


import com.Dishproject.Dishtask.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository
        extends JpaRepository<Dish,Long> {
}