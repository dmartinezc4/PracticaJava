package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilmTest {

	Film a =new Film("El hombre de acero","Henry Cavill","Zack Snyder","Accion",2013);
	
	@Test
	void testFilm() {
		assertEquals(a.getName(),"El hombre de acero");
		assertEquals(a.getActor(),"Henry Cavill");
		assertEquals(a.getAuthor(),"Zack Snyder");
		assertEquals(a.getGenre(),"Accion");
		assertEquals(a.getYearrelease(),2013);
		
	}

}
