package edu.marcio.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.marcio.bookstore.model.PublisherModel;

public interface PublisherRepository extends JpaRepository<PublisherModel,UUID>{
    
}
