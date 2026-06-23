package com.Dishproject.Dishtask.model;

import jakarta.persistence.*;

@Entity
@Table(name="dishes")
public class Dish {

    @Id
    private Long dishId;

    private String dishName;

    private String imageUrl;

    private boolean isPublished;

    public Dish() {}

    public Long getDishId() {
        return dishId;
    }

    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }
}