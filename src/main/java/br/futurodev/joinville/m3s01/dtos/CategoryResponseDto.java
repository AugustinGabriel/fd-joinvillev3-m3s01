package br.futurodev.joinville.m3s01.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryResponseDto {
    private Long id;
    private String name;
    private String description;
    private CategoryResponseDto parentCategory;
}
