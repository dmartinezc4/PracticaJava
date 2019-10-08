package practica;

public class Film {
	private String name;
	private String actor;
	private String director;
	private String genre;
	private int dayrelease;
	private int monthrelease;
	private int yearrelease;
	
	public Film(String na,String act,String dir,String gen,int day,int month,int year){
		name=na;
		actor=act;
		director=dir;
		genre=gen;
		dayrelease=day;
		monthrelease=month;
		yearrelease=year;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String na) {
		name=na;
	}
	
	public String getActor() {
		return actor;
	}
	
	public void setActor(String act) {
		actor=act;	
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String dir) {
		director =dir;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String gen) {
		genre=gen;
	}
	
	public int getDayrelease() {
		return dayrelease;
	}
	
	public void setDayrelease(int day) {
		dayrelease=day;
	}
	
	public int getMonthrelease() {
		return monthrelease;
	}
	
	public void setMonthrelease(int month) {
		monthrelease=month;
	}
	
	public int getYearrelease() {
		return yearrelease;
	}
	
	public void setYearrelease(int year) {
		yearrelease=year;
	}
	
	public void show() {
		System.out.println(name + " directed by "+ director+ " with the actor "+actor+"released in "+dayrelease+"/"+monthrelease + "/" +yearrelease);
	}
}
