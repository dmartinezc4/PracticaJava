package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestockTest {
	
	Shelve c=new Shelve();
	Book a=new Book("El señor de las moscas","William Golding","Novela",224,"5465487");
	Film f =new Film("Joker","Joaquin","Zack Snyder","Meta",2019);	
	Restock mirestock=new Restock(c,a,f);
	@Test
	void test() {
		
		assertEquals(c,mirestock.getEstante());
		assertEquals(a,mirestock.getBook());
		assertEquals(f,mirestock.getFilm());	
	}

}
