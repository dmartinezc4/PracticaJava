package practica;

public class ClockFactory {
	public static final int reloj12=0;
	public static final int reloj24=1;

	public static Clock createClock(int i) {
		/*
	Esto seria un factory method; pues me permite instanciar objetos de unas clases cuya clase padre común es abstracta
		 */
		if(i==reloj12) {
			return new Clock12H();
		}else {
			return new Clock24();
		}
	}
}
