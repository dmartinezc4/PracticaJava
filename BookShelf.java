package practica;

import java.util.*;

public class BookShelf {
	private Vector<Book>shelf=new Vector<Book>();
	
	public BookShelf() {
		shelf.add(new Book("Monogatari","Nissio Issin","Supernatural",1000,"4895623170"));
		shelf.add(new Book("Quijote","Cervantes","Fantasia",100000,"1056798342"));
		shelf.add(new Book("Protagonista","Jose","Fantasia",100,"3625984710"));
		shelf.add(new Book("From Hell","Alan Moore","Terror",2000,"02356897414"));
		shelf.add(new Book("The Dark Night Rises","Frank Miller","Superhéroes",100000,"4895623170"));
		//Want to add some books here so it doesn't show on the menu
	}
	public boolean find(Book bo) {
		for(int i=0;i<shelf.size();i++){
			if(shelf.get(i).getName().equalsIgnoreCase(bo.getName())) {
				return true;
			}
		}
		return false;
	}
	
	public void add(Book bo) {
		shelf.add(bo);
	}
	
	public void remove(Book bo) {
		
		for(int i=0;i<shelf.size();i++){
			
			if(shelf.get(i).getName().equalsIgnoreCase(bo.getName()) && shelf.get(i).getISBN().equalsIgnoreCase(bo.getISBN())) {
				shelf.remove(i);
			}
		}
	}
	
	public boolean isEmpty() {
		boolean empty;
		empty=shelf.isEmpty();
		if(empty==true) {
			return true;
		}else{
			return false;
		}
	}
	
	public void show(int indexe) {
		shelf.get(indexe).show();
	}
	public void showAll() {
		for(Book b:shelf) {
			b.show();
		}
	}
	
}
