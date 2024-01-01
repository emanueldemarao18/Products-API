package com.emanuel.products.dto;

import com.emanuel.products.entities.Category;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;


public class CategoryDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    public CategoryDTO() {

    }

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity) {
        this.id = entity.getId();

        this.name = entity.getName();
    }
}
