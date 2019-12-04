package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {
	
	
	Book a =new Book("El mundo de sofia","Jostein Gardeer","Filosofico",300,"548797");

	@Test
	void test() {//Ni idea de como testear esto tbh
		Product p = null;
		assertEquals(a.getName(),"El mundo de sofia");
		assertEquals(a.getID(),"548797");
	}
	
	//No se como hacer tests de system outs porque segun stack overflow son 20 lineas de codigo
}
