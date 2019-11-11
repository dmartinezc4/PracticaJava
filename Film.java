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
}