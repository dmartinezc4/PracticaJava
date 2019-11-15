package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShelveTest {

	Shelve a=new Shelve();
	
	Book b=new Book("El señor de las moscas","Novela","William Golding",224,"5465487");
	@Test
	void test() {
		a.add(b);
		a.find(b);
	}

}
