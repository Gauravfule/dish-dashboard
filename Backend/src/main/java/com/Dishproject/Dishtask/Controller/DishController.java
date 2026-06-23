package com.Dishproject.Dishtask.Controller;


import com.Dishproject.Dishtask.model.Dish;
import com.Dishproject.Dishtask.service.DishService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dishes")
@CrossOrigin("*")
public class DishController {

    private final DishService service;

    public DishController(DishService service) {
        this.service = service;
    }

    @GetMapping
    public List<Dish> getAll() {
        return service.getAllDishes();
    }

    @PutMapping("/{id}/toggle")
    public Dish toggle(@PathVariable Long id) {
        return service.toggleStatus(id);
    }
}
