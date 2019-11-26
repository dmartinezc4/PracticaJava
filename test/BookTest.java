package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {
	
	Book a=new Book("El señor de las moscas","William Golding","Novela",224,"5465487");

	@Test
	void testBook() {
		assertEquals(a.getName(),"El señor de las moscas");
		assertEquals(a.getAuthor(),"William Golding");
		assertEquals(a.getGenre(),"Novela");
		assertEquals(a.getPages(),224);
		assertEquals(a.getISBN(),"5465487");
	}
	
	@Test
	void testGetName() {
		assertEquals(a.getName(),"El señor de las moscas");
	}
	
	@Test
	void testGetGenre() {
		assertEquals(a.getGenre(),"Novela");
	}
	
	@Test
	void testGetAuthor() {
		assertEquals(a.getAuthor(),"William Golding");
	}
	


}
