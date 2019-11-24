package practica;

public class Film extends Item{
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
		if(super.getGenre()=="fantasia"||super.getGenre()=="ficcion"||super.getGenre()=="accion"||super.getGenre()=="filsófico") {
			suma=suma+30;
		}else {
			suma=suma+50;
		}
		suma=(float) (suma+Math.pow(yearrelease/4, 2));
		
		if(actor.charAt(0)=='J') {
			suma=suma*2;
		}else {
			suma=(float) (suma*1.12);
		}
		return suma;
	}
}