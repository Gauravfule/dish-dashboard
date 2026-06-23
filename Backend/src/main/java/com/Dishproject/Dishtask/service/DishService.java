package com.Dishproject.Dishtask.service;

import com.Dishproject.Dishtask.model.Dish;
import com.Dishproject.Dishtask.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    private final DishRepository repository;

    public DishService(DishRepository repository) {
        this.repository = repository;
    }

    public List<Dish> getAllDishes() {
        return repository.findAll();
    }

    public Dish toggleStatus(Long id) {

        Dish dish = repository.findById(id)
                .orElseThrow();

        dish.setPublished(!dish.isPublished());

        return repository.save(dish);
    }
}
