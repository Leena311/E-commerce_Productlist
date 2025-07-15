package com.madhu.productList.service;

import com.madhu.productList.dto.CategoryRequestDto;
import com.madhu.productList.dto.CategoryResponseDto;
import com.madhu.productList.entity.Category;
import com.madhu.productList.mapper.CategoryMapper;
import com.madhu.productList.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryResponseDto saveCategory(CategoryRequestDto categorydto){
        Category categoryEntity = CategoryMapper.toCategoryEntity(categorydto);
        Category savedCategory = categoryRepository.save(categoryEntity);
        return CategoryMapper.toCategoryDto(savedCategory);
    }



}