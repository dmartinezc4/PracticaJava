package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {
	
	Book a=new Book("El señor de las moscas","Novela","William Golding",224,"5465487");

	@Test
	void testBook() {
		assertEquals(a.getAuthor(),"William Golding");
		assertEquals(a.getName(),"El señor de las moscas");
		assertEquals(a.getGenre(),"Novela");
		assertEquals(a.getISBN(),"5465487");
		assertEquals(a.getPages(),224);
	}


}
