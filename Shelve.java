package practica;

import java.util.*;

public class Shelve implements Vectorinterfaces{
	private Vector<Item> items;

	public Shelve() {
		items=new Vector<Item>();
		//add books
		items.add(new Book ("Monogatari","Nissio Issin","Supernatural",1000,"4895623170"));
		items.add(new Book("Quijote","Cervantes","Fantasia",100000,"1056798342"));
		items.add(new Book("Protagonista","Jose","Fantasia",100,"3625984710"));
		items.add(new Book("From Hell","Alan Moore","Terror",2000,"02356897414"));
		items.add(new Book("The Dark Night Rises","Frank Miller","Superhéroes",100000,"4895623170"));
		//add films
		items.add(new Film("Joker","Joaquin Phoenix","Todd Phillips","Action",2019));
		items.add(new Film("Grave of the firelies","Akiyusi Nosaka","Isao Takahata","Suspense",2003));
		items.add(new Film("Spiderman into the spiderverse","Phil Lord","Peter Ramsey","Adventure",2018));
		items.add(new Film("The Godfather","Marlon Brando","Francis Ford Coppola","Action",1972));
		//Constructor is this way in order to demonstrate there are things in here
	}
	public boolean find(Book a) {
		for(int i=0;i<items.size();i++) {
			if(a.getName()==items.get(i).getName()) {
				return true;
			}
		}
		return false;
	}

	public boolean find (Film a) {
		for(int i=0;i<items.size();i++) {
			if(a==items.get(i)) {
				return true;
			}
		}
		return false;
	}


	public void add(Item a) {
		items.add(a);
	}
	public void add(Book a) {
		items.add(a);
	}
	public void add(Film a) {
		items.add(a);
	}

	public void show() {
		for(int i=0;i<items.size();i++) {
			items.get(i).show();
		}
	}
	public boolean find(Item a) {
		for(int i=0;i<items.size();i++) {
			if(a.getName().equalsIgnoreCase(items.get(i).getName())) {
				return true;
			}
		}
		return false;
	}

	public boolean findb(Book a) {
		for(int i=0;i<items.size();i++) {
			if(a.getName().equalsIgnoreCase(items.get(i).getName())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean findf(Item a) {
		for(int i=0;i<items.size();i++) {
			if(a.getName().equalsIgnoreCase(items.get(i).getName())) {
				return true;
			}
		}
		return false;
	}
	
	public void remove(Item a) {
		for(int i=0;i<items.size();i++) {
			if(a.getName().equalsIgnoreCase(items.get(i).getName())) {
				items.remove(i);
			}
		}
	}
	public Vector<String> sortByName() {
		//Por alguna razon no me deja hacer sort de un vector de items sin pasarlo a list; y si lo hago cosas del menu y otros metodos empiezan a fallar
		//Asi que soy capaz de ordenartelo pero solo ciertas partes del item en si
		Vector<String>names=new Vector<String>();
		for(int i=0;i<items.size();i++) {
			names.add(items.get(i).getName());
		}
		Collections.sort(names);
		return names;
	}
	public Vector<String> sortByGenre() {
		//Por alguna razon no me deja hacer sort de un vector de items sin pasarlo a list; y si lo hago cosas del menu y otros metodos empiezan a fallar
		//Asi que soy capaz de ordenartelo pero solo ciertas partes del item en si
		Vector<String>genre=new Vector<String>();
		for(int i=0;i<items.size();i++) {
			genre.add(items.get(i).getGenre());
		}
		Collections.sort(genre);
		return genre;
	}

}