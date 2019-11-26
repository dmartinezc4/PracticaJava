package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {
	
	Book a=new Book("El señor de las moscas","William Golding","Novela",224,"5465487");
	Book b=new Book("Ander","Zynder","Ficcion",400,"1324575");

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
	
	@Test
	void testGetValue() {//Por alguna razon que no entiendo esto es lo que me da en la calcu pero no funciona aqui
		assertEquals(a.getValue(),170.03);
	}
	
	@Test
	void testGetMaximo() {
		assertEquals(b,Book.Maximo(a,b));
	}
	@Test
	void testGetminimo() {
		assertEquals(a,Book.Minimo(a,b));
	}


}
