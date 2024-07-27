package edu.marcio.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.marcio.bookstore.model.ReviewModel;

public interface ReviewRepository extends JpaRepository<ReviewModel,UUID> {
    
}
