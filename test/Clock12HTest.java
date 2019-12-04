package practica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

class Clock12HTest {

	@Test
	void testgetHora() {
		Clock12H reloj= new Clock12H();

		Calendar hora= Calendar.getInstance();

		String hora12=((hora.get(Calendar.HOUR)<10)? "0" : "") +
				hora.get(Calendar.HOUR )+ ":" +
				((hora.get(Calendar.MINUTE)<10)? "0" : "") +
				hora.get(Calendar.MINUTE )+ ":" +
				((hora.get(Calendar.SECOND)<10)? "0" : "") +
				hora.get(Calendar.SECOND );

		String finalhour= (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)<12) ? (hora12 + "AM") : hora12 + "PM";

		assertEquals(finalhour,reloj.getHora());
	}

}
