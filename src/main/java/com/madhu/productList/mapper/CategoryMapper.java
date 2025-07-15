package com.madhu.productList.mapper;

import com.madhu.productList.dto.CategoryRequestDto;
import com.madhu.productList.dto.CategoryResponseDto;
import com.madhu.productList.entity.Category;

public class CategoryMapper {
   public static CategoryResponseDto toCategoryDto(Category category){
       if(category==null){
           return null;
       }
       CategoryResponseDto crt=new CategoryResponseDto();
       crt.setId(category.getId());
       crt.setName(category.getName());
       crt.setDescription(category.getDescription());
       crt.setCreatedBy(category.getCreatedBy());
       crt.setCreatedDate(category.getCreatedDate());
       return crt;
   }

   public static Category toCategoryEntity(CategoryRequestDto categoryRequestDto){
              Category c=new Category();
              c.setName(categoryRequestDto.getName());
              c.setDescription(categoryRequestDto.getDescription());
              c.setCreatedBy(categoryRequestDto.getCreatedBy());
return c;
   }

}
