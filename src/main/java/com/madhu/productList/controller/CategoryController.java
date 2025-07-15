package com.madhu.productList.controller;


import com.madhu.productList.dto.CategoryRequestDto;
import com.madhu.productList.dto.CategoryResponseDto;
import com.madhu.productList.entity.Category;
import com.madhu.productList.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
@PostMapping
    public CategoryResponseDto createCategory(@RequestBody CategoryRequestDto categoryDto){
    return  categoryService.saveCategory(categoryDto);
}


}
