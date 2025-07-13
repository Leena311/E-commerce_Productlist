package com.madhu.productList.service;

import com.madhu.productList.dto.CategoryDTO;
import com.madhu.productList.entity.Category;
import com.madhu.productList.mapper.CategoryMapper;
import com.madhu.productList.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    // create category
    public CategoryDTO createCategory(CategoryDTO categoryDTO){
        Category category = CategoryMapper.toCategoryEntity(categoryDTO);
        category = categoryRepository.save(category);
        return CategoryMapper.toCategoryDTO(category);

    }
}
