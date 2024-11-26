package org.generation.italy.helloSpringWeb.model.repositories;

import org.generation.italy.helloSpringWeb.model.entites.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositoryJPA extends JpaRepository<Book,Long> {

}
