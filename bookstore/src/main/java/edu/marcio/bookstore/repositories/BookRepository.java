package edu.marcio.bookstore.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.marcio.bookstore.model.BookModel;

public interface BookRepository extends JpaRepository<BookModel,UUID>{
    
    BookModel findBookModelByTitle(String title);// simples queries are provided by spring data jpa


    /*complex queries that spring data jpa doesn't provide you can create */
    @Query(value = "SELECT * FROM BOOK WHERE publisher_id = :id",nativeQuery = true)
    List<BookModel> findBookModelByPublisherId(@Param("id")UUID id);
    // @Param("id") is defining the value of the id parameter in the query above, in others words it's saying that the "id" in the query will be the UUID id, received by parameter when the " findBookModelByPublisherId" function was called
}
