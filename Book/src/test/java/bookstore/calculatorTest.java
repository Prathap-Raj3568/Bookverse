package bookstore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class calculatorTest {
	static calculator cal;
	
	@Test
	void testadd() {
		int actual = cal.add(5, 5);
		int expected = 10;
		assertEquals(expected, actual, "sum of 5 and 5 is 10");
	}
	
	@Test
	void testsub() {
		int actual = cal.sub(5,4);
		int expected = 1;
		assertEquals(expected, actual, "sub of 5 and 4 is 1");
		
	}
	
	@Test
	void testproduct() {
		int actual = cal.product(2, 2);
		int expected = 4;
		assertEquals(expected, actual, "product of 2 and 2 is 4");
	}

	@Test
	void testbool() {
		boolean actual = cal.check(15);
		assertTrue(actual);
	}
	
	@BeforeEach
	void preMethod() {
		cal = new calculator();
		System.out.println("runs after each test cases..");
		
	}
	
	
	@AfterEach
	void afterMethod() {
		cal = null;
		System.out.println("runs before each test cases..");
		
	}
	
	@BeforeAll
	static void preAll() {
		
		System.out.println("this runs only once before all the test cases");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("this runs only once after all the test cases");
	}
	
}
