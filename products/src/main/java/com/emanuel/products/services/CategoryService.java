package com.emanuel.products.services;

import com.emanuel.products.entities.Category;
import com.emanuel.products.repositories.CategoryRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired

    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }
}
