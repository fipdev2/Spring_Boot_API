package atividade1.app.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atividade1.app.models.Book;
import atividade1.app.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> findAll() {
        List<Book> Books = repository.findAll();
        return Books;
    }

    public Book findById(UUID id) {
        Book Book = repository.findById(id).get();
        return Book;
    }

    public String createBook(Book Book) {
        repository.save(Book);
        return "Book has been created successfully";
    }

    public String updateBook(UUID id, Book Book) {
        Book response = findById(id);

        Book.setTitle(response.getTitle());
        Book.setDurationInMonths(response.getPublicationDate());
        repository.save(Book);

        return "Book has been updated successfully";
    }

    public String deleteBook(UUID id) {
        repository.deleteById(id);
        return "Book has been deleted successfully";
    }
}
