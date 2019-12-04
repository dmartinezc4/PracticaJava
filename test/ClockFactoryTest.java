package practica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

class ClockFactoryTest {

	@Test
	void test() {
		Clock ampm=ClockFactory.createClock(ClockFactory.reloj12);
		Clock fullhourclock=ClockFactory.createClock(ClockFactory.reloj24);
		
		Calendar hora= Calendar.getInstance();
		
		//Aqui testeo el reloj de AM PM
		String hora12=((hora.get(Calendar.HOUR)<10)? "0" : "") +
				hora.get(Calendar.HOUR )+ ":" +
				((hora.get(Calendar.MINUTE)<10)? "0" : "") +
				hora.get(Calendar.MINUTE )+ ":" +
				((hora.get(Calendar.SECOND)<10)? "0" : "") +
				hora.get(Calendar.SECOND );

		String finalhour= (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)<12) ? (hora12 + "AM") : hora12 + "PM";
		
		assertEquals(finalhour,ampm.getHora());
		
		//Aqui cambio el finalhour para ser la hora de un reloj que da hasta las 24 horas
		
		finalhour=((hora.get(Calendar.HOUR)<10)? "0" : "") +
				hora.get(Calendar.HOUR )+ ":" +
				((hora.get(Calendar.MINUTE)<10)? "0" : "") +
				hora.get(Calendar.MINUTE )+ ":" +
				((hora.get(Calendar.SECOND)<10)? "0" : "") +
				hora.get(Calendar.SECOND );
		assertEquals(finalhour,fullhourclock.getHora());
	}

}
