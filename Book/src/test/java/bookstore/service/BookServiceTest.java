package bookstore.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import bookstore.Entity.Book;
import bookstore.repository.BookRepository;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

	@Mock
	private BookRepository bookrepository ;
	
	@InjectMocks
	private BookService bookservice;
	
//	@Test
//	void getallbok() {
//		when(bookrepository.findById(1)).thenReturn();
//		
//		Book b= bookservice.getAllbooks(1);
//		assertNotNull(b);
//		
//	}

}
