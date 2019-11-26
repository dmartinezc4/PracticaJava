package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilmTest {

	Film a =new Film("El hombre de acero","Henry Cavill","Zack Snyder","Accion",2013);
	Film b =new Film("Joker","Joaquin","Zack Snyder","Meta",2019);
	
	@Test
	void testFilm() {
		assertEquals(a.getName(),"El hombre de acero");
		assertEquals(a.getActor(),"Henry Cavill");
		assertEquals(a.getAuthor(),"Zack Snyder");
		assertEquals(a.getGenre(),"Accion");
		assertEquals(a.getYearrelease(),2013);
		
	}
	
	@Test
	void testGetValue() {//Lo mismo que con el de Book; me da error como test pero esto es lo que me sale en la calculadora
		assertEquals(283651.83,a.getValue());
	}
	
	@Test
	void testGetMaximo() {
		assertEquals(b,Film.Maximo(a, b));
	}
	
	@Test
	void testGetMinimo() {
		assertEquals(a,Film.Minimo(a, b));
	}
	

}
