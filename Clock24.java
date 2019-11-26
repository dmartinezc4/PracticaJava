package practica;

import java.util.Calendar;

public class Clock24 extends Clock{

	String getHora() {
		Calendar hora= Calendar.getInstance();

		return ((hora.get(Calendar.HOUR)<10)? "0" : "") +
				hora.get(Calendar.HOUR )+ ":" +
				((hora.get(Calendar.MINUTE)<10)? "0" : "") +
				hora.get(Calendar.MINUTE )+ ":" +
				((hora.get(Calendar.SECOND)<10)? "0" : "") +
				hora.get(Calendar.SECOND );
	}

}
