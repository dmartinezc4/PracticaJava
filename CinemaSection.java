package practica;

import java.util.*;

public class CinemaSection {
	Vector<Film>films=new Vector<Film>();
	
	public CinemaSection() {
		films.add(new Film("Joker","Joaquin Phoenix","Todd Phillips","Action",4,10,2019));
		films.add(new Film("Grave of the firelies","Akiyusi Nosaka","Isao Takahata","Suspense",24,11,2003));
		films.add(new Film("Spiderman into the spiderverse","Phil Lord","Peter Ramsey","Adventure",21,12,2018));
		films.add(new Film("The Godfather","Marlon Brando","Francis Ford Coppola","Action",20,10,1972));
	}
	
	public boolean find(Film flm) {
		for(int i=0;i<films.size();i++){
			if(films.get(i).getName().equalsIgnoreCase(flm.getName())) {
				return true;
			}
		}
		return false;
	}
	
	public void add(Film flm) {
		films.add(flm);
	}
	
	public void remove(Film flm) {
		
		for(int i=0;i<films.size();i++){
			
			if(films.get(i).getName().equalsIgnoreCase(flm.getName()) && films.get(i).getDirector().equalsIgnoreCase(flm.getDirector())) {
				films.remove(i);
			}
		}
	}
	
	public boolean isEmpty() {
		boolean empty;
		empty=films.isEmpty();
		if(empty==true) {
			return true;
		}else{
			return false;
		}
	}
	
	
	public void showAll() {
		for(Film f:films) {
			f.show();
		}
	}
}
