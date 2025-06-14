package com.librarymanager.backend.service;

import com.librarymanager.backend.entity.Category;
import com.librarymanager.backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    private void addCategory(String categoryName) {
        Category category = new Category();
        category.setName(categoryName);
        categoryRepository.save(category);
    }

    private void deleteCategoryById(Integer categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    private List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
