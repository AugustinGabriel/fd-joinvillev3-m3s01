package br.futurodev.joinville.m3s01.dtos;

public record CustomerRequestDto(
    String name,
    String document,
    String email,
    String password
) {
}
