package br.futurodev.joinville.m3s01.services;

import br.futurodev.joinville.m3s01.dtos.AuthorRequestDto;
import br.futurodev.joinville.m3s01.dtos.AuthorResponseDto;
import br.futurodev.joinville.m3s01.entities.Author;
import br.futurodev.joinville.m3s01.mappers.AuthorMapper;
import br.futurodev.joinville.m3s01.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorMapper mapper;
    private final AuthorRepository repository;

    @Override
    public AuthorResponseDto create(AuthorRequestDto dto) {
        Author entity = mapper.requestToEntity(dto);
        entity = repository.save(entity);
        return mapper.entityToResponse(entity);
    }

    @Override
    public AuthorResponseDto findById(Long id) {
        return null;
    }

    @Override
    public List<AuthorResponseDto> findAll() {
        return List.of();
    }

    @Override
    public AuthorResponseDto update(Long id, AuthorRequestDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
