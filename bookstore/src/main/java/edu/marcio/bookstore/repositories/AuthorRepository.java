package edu.marcio.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.marcio.bookstore.model.AuthorModel;

public interface AuthorRepository extends JpaRepository<AuthorModel,UUID>{
    
}
