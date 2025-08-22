package bookstore.service;

import bookstore.Entity.Book;
import bookstore.repository.BookRepository;
import io.micrometer.core.instrument.MeterRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
	
	private final MeterRegistry meterRegistry;

    public BookService(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @Autowired
    private BookRepository bookRepository;
    
    Logger logger = LoggerFactory.getLogger(BookService.class);

    public Book addBook(Book book) {
//    	logger.info("adding Book to the dadabase ");
//    	logger.error("adding Book to the dadabase ");
//    	logger.warn("adding Book to the dadabase ");
//    	logger.trace("adding Book to the dadabase ");
    	
    	System.out.println("adding student in database");
    	System.out.println("adding student in database");
    	System.out.println("adding student in database");
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
    	meterRegistry.counter("bookstore.books.fetched").increment();
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
    	meterRegistry.counter("bookstore.book.byid.fetched").increment();
//    	System.out.println("adding student in database");
//    	System.out.println("adding student in database");
//    	System.out.println("adding student in database");
//    	
    	logger.info("adding Book to the dadabase ");
    	logger.error("adding Book to the dadabase ");
    	logger.warn("adding Book to the dadabase ");
    	logger.trace("adding Book to the dadabase ");
    	logger.debug("adding Book to the dadabase ");
        return bookRepository.findById(id);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow();
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setPrice(bookDetails.getPrice());
        book.setPublishedDate(bookDetails.getPublishedDate());
        return bookRepository.save(book);
    }


    
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
    
    public List<Book> getAllbooks(){
		Iterable<Book> iterable=bookRepository.findAll();
		List<Book> list=(List<Book>)iterable;
		return list;
	}
}
