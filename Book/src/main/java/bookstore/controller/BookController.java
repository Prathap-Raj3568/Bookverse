package bookstore.controller;

import bookstore.Entity.Book;
import bookstore.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
	
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
    	logger.info("Adding new book: {}", book.getTitle());
        return bookService.addBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        logger.info("Fetching all books");
        return bookService.getAllBooks();
    }
    
    @GetMapping("/allbooks")
	public List<Book> getAllBooks1(){
		return this.bookService.getAllbooks();
		
	}

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
    	logger.debug("Fetching book with ID {}", id);
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        return bookService.updateBook(id, bookDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
    	logger.warn("Deleting book with ID {}", id);
        bookService.deleteBook(id);
    }
}
