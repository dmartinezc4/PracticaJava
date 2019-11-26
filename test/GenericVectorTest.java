package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GenericVectorTest {

	
	
	
	@Test
	void testGenericVector() {
		GenericVector a=new GenericVector();
		a.add(5);
		a.add("Hola");
		assertEquals("Hola",a.get(1));
	}

	@Test
	void testAdd() {
		GenericVector a=new GenericVector();
		a.add(5);
		a.add("Hola");
		a.add(5.5);
		assertEquals(5.5,a.get(a.getContent().size()-1));
	}
	
	

	

}
