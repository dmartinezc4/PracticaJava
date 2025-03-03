package practica;

public class Film extends Item implements Product{
	private String actor;
	private int yearrelease;
	
	public Film(String na,String act,String dir,String gen,int year){
		super(na,dir,gen);
		actor=act;
		yearrelease=year;
	}
	
	public String getActor() {
		return actor;
	}
	
	public void setActor(String act) {
		actor=act;	
	}
	
	public int getYearrelease() {
		return yearrelease;
	}
	
	public void setYearrelease(int year) {
		yearrelease=year;
	}
	
	public void show() {
		System.out.println(super.getName() + " directed by "+ super.getAuthor()+ " with the actor "+actor+" released in " +yearrelease);
	}

	public double getValue() {
		float suma=0;
		if(super.getName().charAt(0)=='A' ||super.getName().charAt(0)=='Z') {
			suma=suma+50;
		}else {
			suma=suma+30;
		}
		if(super.getGenre()=="Fantasia"||super.getGenre()=="Ficcion"||super.getGenre()=="Accion"||super.getGenre()=="Filsófico") {
			suma=suma+30;
		}else {
			suma=suma+50;
		}
		suma=(float) (suma+Math.pow(yearrelease/400, 2));
		
		if(actor.charAt(0)=='J') {
			suma=suma*2;
		}else {
			suma=(float) (suma*1.12);
		}
		return suma;
	}
	public static Film Maximo(Film a,Film b) {
		if(a.getValue()==Math.max(a.getValue(), b.getValue())) {
			return a;
		}else {
			return b;
		}
	}
	public static Film Minimo(Film a, Film b) {
		if(a.getValue()==Math.min(a.getValue(), b.getValue())) {
			return a;
		}else {
			return b;
		}
	}

	@Override
	public String getID() {
		return super.getName() + " "+ super.getAuthor();
	}
}