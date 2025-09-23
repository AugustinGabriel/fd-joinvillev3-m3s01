package br.futurodev.joinville.m3s01.dtos;

public record CategoryRequestDto(
    String name,
    String description,
    Long parentCategoryId
) {
}
