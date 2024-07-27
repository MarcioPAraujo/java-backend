package edu.marcio.bookstore.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import edu.marcio.bookstore.dataTransferObject.BookRecordDto;
import edu.marcio.bookstore.model.BookModel;
import edu.marcio.bookstore.model.ReviewModel;
import edu.marcio.bookstore.repositories.AuthorRepository;
import edu.marcio.bookstore.repositories.BookRepository;
import edu.marcio.bookstore.repositories.PublisherRepository;
import jakarta.transaction.Transactional;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final PublisherRepository publisherRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository,
            PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

    @Transactional
    public BookModel saveBook (BookRecordDto bookRecordDto){
        BookModel bookModel = new BookModel();

        bookModel.setAuthors(authorRepository.findAllById(bookRecordDto.authorIds()).stream().collect(Collectors.toSet()));
        
        bookModel.setPublisher(publisherRepository.findById(bookRecordDto.publisherId()).get());

        bookModel.setTitle(bookRecordDto.title());

        ReviewModel reviewModel = new ReviewModel();
        reviewModel.setComment(bookRecordDto.reviewComment());
        reviewModel.setBook(bookModel);
        
        bookModel.setReview(reviewModel);



        return bookRepository.save(bookModel);
    }

    public List<BookModel> getAllBooks(){
        return bookRepository.findAll();
    }
    @Transactional
    public void deleteBook(UUID id){
        bookRepository.deleteById(id);
    }
    
}
