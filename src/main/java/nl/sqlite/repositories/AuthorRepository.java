package nl.sqlite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nl.sqlite.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
