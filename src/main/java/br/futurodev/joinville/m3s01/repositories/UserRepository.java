package br.futurodev.joinville.m3s01.repositories;

import br.futurodev.joinville.m3s01.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
