package practica;

public class Book {
	private String name;
	private String author;
	private String genre;
	private int pages;
	private String ISBN;
	
	
	public Book(String na,String auth,String gen,int pags,String is) {
		name=na;
		author=auth;
		genre=gen;
		pages=pags;
		ISBN=is;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String na) {
		name=na;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String auth) {
		author=auth;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String gen) {
		genre=gen;
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pag) {
		pages=pag;
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String is) {
		ISBN=is;
	}
	
	public void show() {
		System.out.println(name + " by"+ author + " with " + pages +"pages and from the " + genre +" genre");
	}
}
