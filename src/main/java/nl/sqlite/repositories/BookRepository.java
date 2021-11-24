package nl.sqlite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nl.sqlite.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
