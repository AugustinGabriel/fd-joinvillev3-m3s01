package br.futurodev.joinville.m3s01.dtos;

import java.time.LocalDate;
import java.util.List;

public record LoanRequestDto(
    Long customerId,
    LocalDate returnDate,
    List<LoanBookRequestDto> items
) {
}
