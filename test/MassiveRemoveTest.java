package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MassiveRemoveTest {
	
	Shelve c=new Shelve();
	Book a=new Book("El señor de las moscas","William Golding","Novela",224,"5465487");
	Film f =new Film("Joker","Joaquin","Zack Snyder","Meta",2019);	
	MassiveRemove miremove=new MassiveRemove(c,a,f);
	
	@Test
	void test() {
		assertEquals(c,miremove.getEstante());
		assertEquals(a,miremove.getBook());
		assertEquals(f,miremove.getFilm());
	}

}
