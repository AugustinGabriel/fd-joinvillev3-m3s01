package br.futurodev.joinville.m3s01.dtos;

import br.futurodev.joinville.m3s01.enums.UserRole;

public record UserRequestDto(
    String name,
    String email,
    String password,
    UserRole role
) {
}
