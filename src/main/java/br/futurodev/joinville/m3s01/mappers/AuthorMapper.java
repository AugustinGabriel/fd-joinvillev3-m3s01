package br.futurodev.joinville.m3s01.mappers;

import br.futurodev.joinville.m3s01.dtos.AuthorRequestDto;
import br.futurodev.joinville.m3s01.dtos.AuthorResponseDto;
import br.futurodev.joinville.m3s01.entities.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    Author requestToEntity(AuthorRequestDto dto);

    AuthorResponseDto entityToResponse(Author entity);

}
