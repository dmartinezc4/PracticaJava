package practica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

class Clock24Test {

	@Test
	void test() {
		Clock24 reloj= new Clock24();
		
		Calendar hora= Calendar.getInstance();
		
		String finalhour=((hora.get(Calendar.HOUR)<10)? "0" : "") +
		hora.get(Calendar.HOUR )+ ":" +
		((hora.get(Calendar.MINUTE)<10)? "0" : "") +
		hora.get(Calendar.MINUTE )+ ":" +
		((hora.get(Calendar.SECOND)<10)? "0" : "") +
		hora.get(Calendar.SECOND );
		
		assertEquals(finalhour,reloj.getHora());
	}

}
