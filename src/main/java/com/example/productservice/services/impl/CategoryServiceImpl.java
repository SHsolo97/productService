package com.example.productservice.services.impl;

import com.example.productservice.models.Category;
import com.example.productservice.repositories.CategoryRepository;
import com.example.productservice.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Category AddNewCategory(String categoryName) {
        Category category = new Category();
        category.setName(categoryName);
        categoryRepository.save(category);
        return category;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.getAllByDeletedIsFalse();
    }
}
