package br.futurodev.joinville.m3s01.dtos;

public record BookRequestDto(
    String title,
    String subtitle,
    Long categoryId,
    Long authorId
) {
}
