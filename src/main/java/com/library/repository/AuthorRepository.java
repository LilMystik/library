package com.library.repository;

import com.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
  Author findAuthorById(Long id);

  Author findAuthorByName(String name);
}
