package com.example.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {

    String title;

    String description;

    String imageUrl;
    @ManyToOne()
    Category category;

    double price;

}
