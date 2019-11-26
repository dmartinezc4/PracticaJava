package practica;

import java.util.Calendar;

public class Clock12H extends Clock{
	
	public String getHora() {
		Calendar hora= Calendar.getInstance();
		
		String hora12=((hora.get(Calendar.HOUR)<10)? "0" : "") +
						hora.get(Calendar.HOUR )+ ":" +
					  ((hora.get(Calendar.MINUTE)<10)? "0" : "") +
						hora.get(Calendar.MINUTE )+ ":" +
					  ((hora.get(Calendar.SECOND)<10)? "0" : "") +
						hora.get(Calendar.SECOND );
		
		return (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)<12) ? (hora12 + "AM") : hora12 + "PM";
	}
}
