package com.emanuel.products.services;

import com.emanuel.products.dto.CategoryDTO;
import com.emanuel.products.entities.Category;
import com.emanuel.products.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CategoryService {

    @Autowired

    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();

       return list.stream().map(CategoryDTO::new).collect(Collectors.toList());
       /* List<CategoryDTO> listDTO = new ArrayList<>();

        for (Category cat : list) {
            listDTO.add(new CategoryDTO(cat));
        }

        return listDTO;*/
    }
}
